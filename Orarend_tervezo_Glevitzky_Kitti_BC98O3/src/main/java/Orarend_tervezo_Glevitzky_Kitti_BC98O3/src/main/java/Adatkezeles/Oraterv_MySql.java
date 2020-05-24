package Adatkezeles;

import controller.Oc;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder

public class Oraterv_MySql {
    Oc oc= new Oc();

    @Id
    @GeneratedValue
    private String targy=oc.targymentes;

    @Column
    private String nap=oc.napmentes;

    @Column
    private String ora=oc.oramentes;

    @Column
    private String evfolyam=oc.evfolyammentes;

    @Column
    private String osztaly=oc.osztalymentes;
}
