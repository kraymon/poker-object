package fr.pantheonsorbonne.cri;
import java.util.Random;
public class Deck {

    String[] couleur = {"COEUR","CARREAU","PIQUE","TREFLE"};
    String[] valeur = {"AS","ROI","DAME","VALET","DIX","NEUF","HUIT","SEPT","SIX","CINQ","QUATRE","TROIS","DEUX"};

    public Card[] newRandomHand(){
        Random random = new Random();

        Card carte1 = new Card(valeur[random.nextInt(5)],couleur[random.nextInt(5)]);
        Card carte2 = new Card(valeur[random.nextInt(5)],couleur[random.nextInt(5)]);
        Card carte3 = new Card(valeur[random.nextInt(5)],couleur[random.nextInt(5)]);
        Card carte4 = new Card(valeur[random.nextInt(5)],couleur[random.nextInt(5)]);
        Card carte5 = new Card(valeur[random.nextInt(5)],couleur[random.nextInt(5)]);

        Card[] hand = {carte1,carte2,carte3,carte4,carte5};
        
        return hand;
    }

    public 



}
