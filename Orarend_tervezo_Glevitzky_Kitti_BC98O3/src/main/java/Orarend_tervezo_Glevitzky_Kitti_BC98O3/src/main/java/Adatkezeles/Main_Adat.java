package Adatkezeles;

import controller.Oc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main_Adat {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("orarend-mysql");
        EntityManager em= emf.createEntityManager();
        Oc oc= new Oc();

        Oraterv_MySql.Oraterv_MySqlBuilder oratervezet= Oraterv_MySql.builder().targy(oc.targymentes).nap(oc.napmentes).ora(oc.oramentes).evfolyam(oc.evfolyammentes).osztaly(oc.osztalymentes);
        em.getTransaction().begin();
        em.persist(oratervezet);
        em.getTransaction().commit();
        System.out.println(oratervezet);

        em.close();
        emf.close();
    }
}
