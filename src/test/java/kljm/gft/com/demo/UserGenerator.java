package kljm.gft.com.demo;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserGenerator {
    private Fairy fairy = Fairy.create();

    private OldUser generateOldUser(){
        Person person = fairy.person();

        OldUser oldUser = new OldUser();
        oldUser.setName(person.getFirstName());
        oldUser.setSurname(person.getLastName());
        oldUser.setEmail(person.getEmail());
        oldUser.setDateOfBirth(person.getDateOfBirth());

        return oldUser;
    }
    private NewUser mapToNewUser(OldUser oldUser) {
        NewUser newUser = new NewUser();
        newUser.setName(oldUser.getName());
        newUser.setSurname(oldUser.getSurname());
        newUser.setEmail(oldUser.getEmail());
        newUser.setDateOfBirth(oldUser.getDateOfBirth());
        newUser.setAge(0);

        return newUser;
    }

    public List<OldUser> generateOldUserList(int numberOfUsers){
        List<OldUser> oldUsers = new ArrayList<>();
        for (int i=0; i < numberOfUsers; i++){
            oldUsers.add(generateOldUser());
        }
        return oldUsers;
    }

    public List<NewUser> generateNewUserList(List<OldUser> oldUsers) {
        return oldUsers.stream().map(oldUser -> mapToNewUser(oldUser)).collect(Collectors.toList());
    }
}
