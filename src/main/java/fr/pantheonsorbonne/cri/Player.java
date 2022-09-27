package fr.pantheonsorbonne.cri;
import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name){
        this.name=name;
    } 

    public String getName(){
        return this.name;
    }

    private Card[] hand = new Card[5];
    public void setHand(Card[] main){
        //à definire
        this.hand=main;
    }

    public void getCardsToDiscard(){
        //à definire
        //for(Card)
        Scanner sc = new Scanner(System.in);
        int[] changer = new int[5];

        

    }

    public void addCard(Card[] newCard){
        //à definire

    }

    public void getHandString(){
        //à definire

        for(Card i : this.hand){
            System.out.println(i.getValeur()+" "+i.getCouleur());
        }
    }

    

    
}
