package person;

import com.github.javafaker.*;
import com.github.javafaker.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Builder
@Entity
public class Person {

    public static enum  Gender {
        FEMALE, MALE;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Name name;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private Options gender;

    @Embedded
    private Address address;

    private Internet email;

    private Company profession;
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setGender(Options gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(Internet email) {
        this.email = email;
    }

    public void setProfession(Company profession) {
        this.profession = profession;
    }

    public Person(Long id, Name name, LocalDate dob, Options gender, Address address, Internet email, Company profession) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.profession = profession;
    }
}
