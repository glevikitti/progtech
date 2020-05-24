package Adatkezeles;

import com.google.inject.Guice;
import com.google.inject.Injector;
import controller.Oc;
import guice.PersistenceModule;
public class Main_Dao {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PersistenceModule("Orarend_adattabla_GK"));

        Oc oc= new Oc();

        Orarend_adattabla_GK orarend = Orarend_adattabla_GK.builder()
                .targy(oc.miatargy)
                .nap(oc.mianap)
                .ora(oc.miaora)
                .evfolyam(oc.miaevfolyam)
                .osztaly(oc.miaosztaly)
                .build();
        System.out.println(orarend);



    }
}
