package fr.pantheonsorbonne.cri;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Deck {

    final static String[] couleur = {"COEUR","CARREAU","PIQUE","TREFLE"};
    final static String[] valeur = {"AS","ROI","DAME","VALET","DIX","NEUF","HUIT","SEPT","SIX","CINQ","QUATRE","TROIS","DEUX"};
    static List<String> repetition=new ArrayList<>() ;


    public static Card[] newRandomHand(){
        Random random = new Random();
        Card[] hand = new Card[5];

        for(int i =0; i<5; i++){
            int indexCouleur = random.nextInt(4);
            int indexValeur = random.nextInt(13);
            
             
            while(repetition.contains(valeur[indexValeur]+couleur[indexCouleur])){
                indexCouleur = random.nextInt(4);
                indexValeur = random.nextInt(13);
            }
            
            Card carte = new Card(valeur[indexValeur],couleur[indexCouleur]);
            hand[i] = carte;
            repetition.add(valeur[indexValeur]+couleur[indexCouleur]);
            }
       
        return hand;
    }

    
    public static Card[] getRandomCards(int n){
        Random random = new Random();
        Card[] hand = new Card[n];

         
        for(int i =0; i<n; i++){
            int indexCouleur = random.nextInt(4);
            int indexValeur = random.nextInt(13);

            while(repetition.contains(valeur[indexValeur]+couleur[indexCouleur])){
                indexCouleur = random.nextInt(4);
                indexValeur = random.nextInt(13);
            }

            Card newCarte = new Card(valeur[indexValeur],couleur[indexCouleur]);
            hand[i] = newCarte;
            repetition.add(valeur[indexValeur]+couleur[indexCouleur]);
              
        }

        return hand;
    
    }
}
        





