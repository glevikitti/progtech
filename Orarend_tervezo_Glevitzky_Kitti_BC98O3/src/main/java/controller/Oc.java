package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Orarendterv;

/*Controller*/
public class Oc {
    @FXML
    private TextField targy;

    @FXML
    private TextField nap;

    @FXML
    private TextField ora;


    @FXML
    private TextField evfolyam;


    @FXML
    private TextField osztaly;

    @FXML
    private Label eredmeny;

    private Orarendterv orarend;

    @FXML
    public void initialize() {
        orarend = new Orarendterv();
    }

    public String targymentes;
    public String napmentes;
    public String oramentes;
    public String evfolyammentes;
    public String osztalymentes;
    public String vegeredmeny;

    public String miatargy="matematika";
    public String mianap="hétfő";
    public String miaora="4";
    public String miaevfolyam="negyedik";
    public String miaosztaly="A";



    public void targyhozzaad(javafx.event.ActionEvent actionEvent) {
        //targy.setText(orarend.kiirtargy(miatargy));
        targymentes=orarend.kiirtargy(targy.getText());


    }

    public void naphozzaad(javafx.event.ActionEvent actionEvent) {
        //nap.setText(orarend.kiirnap(mianap));
        napmentes=orarend.kiirnap(nap.getText());


    }

    public void orahozzaad(ActionEvent actionEvent) {
        //ora.setText(orarend.kiirora(miaora));
        oramentes=orarend.kiirora(ora.getText());

    }

    public void evfolyamhozzaad(javafx.event.ActionEvent actionEvent) {
       // evfolyam.setText(orarend.kiirevfolyam(miaevfolyam));
        evfolyammentes=orarend.kiirevfolyam(evfolyam.getText());


    }

    public void osztayhozzaad(javafx.event.ActionEvent actionEvent) {
        //osztaly.setText(orarend.kiirosztaly(miaosztaly));
        osztalymentes=orarend.kiirosztaly(osztaly.getText());


    }

    public void vegkiiratas(ActionEvent actionEvent) {
        eredmeny.setText(orarend.kiirveg(targymentes+" "+napmentes+" "+oramentes+" "+evfolyammentes+" "+osztalymentes));
        vegeredmeny=eredmeny.getText();

    }


}
