package log;

import controller.Oc;
import org.tinylog.Logger;

/*Példa a loggolásra*/
public class Log_Main {
    public static void main(String[] args) {
        Oc oc= new Oc();

        Logger.error(new RuntimeException(), "Valami nem mukodik ugy, ahogyan annak kellene");
        Logger.info(oc.miatargy);
        Logger.info(oc.mianap);
        Logger.info(oc.miaora);
        Logger.info(oc.miaevfolyam);
        Logger.info(oc.miaosztaly);


    }
}
