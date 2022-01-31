package main.java.fr.univamu.iut.ex1;
import java.util.*;

public class ecran  {

    ecran(){};

    public void affichage(capteur op){

        System.out.println("Temperateure : " + op.getTemp());
        System.out.println("Humidité : " + op.getHumidite());


    }


}
