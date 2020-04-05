package legoset;

import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Legoset lego= new Legoset();
        Weight weight= new Weight();
        Minifig mini= new Minifig();
        List<Minifig> min= new ArrayList<>() ;
        Set<String> tag=new TreeSet<>();
        tag.add("StarFighter");
        tag.add("Stormtrooper");
        tag.add("Star Wars");
        tag.add("Solo");
        min.add(new Minifig(2,"Imperial Mudtrooper"));
        min.add(new Minifig(1, "Imperial pilot"));
        min.add(new Minifig(1, "Mimban Stormtrooper"));

        lego.setNumber("75211");

        mini.setName("Imperial TIE Fighter");
        lego.setTheme("Star Wars");
        lego.setSubtheme("Solo");
        lego.setYear(Year.of(2018));
        lego.setPieces(519);
        lego.setTags(tag);
        lego.setMinifigs(min);
        weight.setUnit("kg");
        weight.setWeight(0.89);
        lego.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(lego,System.out);
    }
}
