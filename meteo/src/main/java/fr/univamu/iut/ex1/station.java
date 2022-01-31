package main.java.fr.univamu.iut.ex1;
import java.util.*;


public class station {

    private List<capteur>listeCapteur = new ArrayList<capteur>();
    private List<ecran>listeEcran = new ArrayList<ecran>();

    public void addCapteur(capteur capteur){
        listeCapteur.add(capteur);
    }
    public void addEcran(ecran ecran){
        listeEcran.add(ecran);
    }

    public void test(){



        for(ecran ecran: listeEcran){
         for(capteur capteur: listeCapteur){
          ecran.affichage(capteur);
         }
        }
    }



}