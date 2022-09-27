package fr.pantheonsorbonne.cri;
import java.util.Random;
import java.util.ArrayList;

public class Deck {

    static String[] couleur = {"COEUR","CARREAU","PIQUE","TREFLE"};
    static String[] valeur = {"AS","ROI","DAME","VALET","DIX","NEUF","HUIT","SEPT","SIX","CINQ","QUATRE","TROIS","DEUX"};
    static ArrayList<String> repetition=new ArrayList<String>() ;


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
        /* 
        Card carte1 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
        Card carte2 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
        Card carte3 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
        Card carte4 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
        Card carte5 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);

        Card[] hand = {carte1,carte2,carte3,carte4,carte5};
        */
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
              
        }

        return hand;
     /* 
        if(n==1){
            Card newCarte1 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            hand[0]= newCarte1;
            return hand;
        }
        else if(n==2){
            Card newCarte1 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte2 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            hand[0]= newCarte1;
            hand[1]= newCarte2;
            return hand;
        }
        else if(n==3){
            Card newCarte1 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte2 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte3 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            hand[0]= newCarte1;
            hand[1]= newCarte2;
            hand[2]= newCarte3;
            return hand;
        }
        else if(n==4){
            Card newCarte1 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte2 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte3 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte4 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            hand[0]= newCarte1;
            hand[1]= newCarte2;
            hand[2]= newCarte3;
            hand[3]= newCarte4;
            return hand;
        }
        else if(n==5){
            Card newCarte1 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte2 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte3 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte4 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            Card newCarte5 = new Card(valeur[random.nextInt(12)],couleur[random.nextInt(3)]);
            hand[0]= newCarte1;
            hand[1]= newCarte2;
            hand[2]= newCarte3;
            hand[3]= newCarte4;
            hand[4]= newCarte5;

            return hand;
        }

    */
    }
}
        





