package kljm.gft.com.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OldUser {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String email;
}
