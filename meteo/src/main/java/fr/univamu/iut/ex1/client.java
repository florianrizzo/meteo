package main.java.fr.univamu.iut.ex1;

public class client {

    public static void main(String[] args) {
        capteur Capteur2 = new capteur(10,10);
        capteur Capteur3 = new capteur(27,15);

        ecran ecran = new ecran();
        ecran ecran2 = new ecran();
        ecran ecran3 = new ecran();

        station station = new station();

        station.addCapteur(Capteur2);
        station.addCapteur(Capteur3);
        station.addEcran(ecran);
        station.addEcran(ecran2);
        station.addEcran(ecran3);


        station.test();


    }



}
