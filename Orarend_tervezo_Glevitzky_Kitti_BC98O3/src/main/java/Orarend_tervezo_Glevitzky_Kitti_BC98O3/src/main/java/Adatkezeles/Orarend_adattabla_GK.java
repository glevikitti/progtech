package Adatkezeles;

import controller.Oc;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*Példa az adatbázis kezelésre*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity

public class Orarend_adattabla_GK {
    Oc oc= new Oc();

        @GeneratedValue
        @Id
        private Long id;

        @Column()
        private String targy;

        @Column()
        private String nap;

        @Column()
        private String ora;

        @Column()
        private String evfolyam;

        @Column()
        private String osztaly;


    }

