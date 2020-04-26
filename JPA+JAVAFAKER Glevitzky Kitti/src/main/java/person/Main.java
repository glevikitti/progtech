package person;

import com.github.javafaker.*;

import com.github.javafaker.Address;
import jdk.jfr.Percentage;
import org.hibernate.cache.spi.support.AbstractDomainDataRegion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.ZoneId;
import java.util.Calendar;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("person-mysql");


    public static Person randomPerson(){
        Faker faker= new Faker();
        Person p= new Person();
        p.setAddress(faker.address());
        p.setProfession(faker.company());
        DateAndTime localdate = faker.date();
        p.setEmail(faker.internet());
        p.setName(faker.name());
        p.setGender(faker.options());
        java.util.Date date = null;
        java.time.LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        p.setDob(localDate);


        return p;

    }
    public static void main(String[] args) {
        for (int i=0;i<=1000;i++){
            randomPerson();
        }
        emf.close();

    }
}
