package fr.pantheonsorbonne.cri;
import java.util.Scanner;
import java.util.ArrayList;

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


    Scanner sc = new Scanner(System.in);
    public Card[] getCardsToDiscard(){
        //à definire
        //for(Card)
        int nbDiscard = sc.nextInt();
        Card[] card = new Card[nbDiscard];
        for(int i=0; i<nbDiscard; i++){
            int indexDiscard = sc.nextInt();
            card[i]=hand[indexDiscard];
        }

        

    }

    public void addCard(Card[] newCard){
        //à definire

    }

    public void getHandString(){
        //à definire

        for(Card i : this.hand){
            if(i!=null){
                System.out.println(i.getValeur()+" "+i.getCouleur());
            }
            else{
                System.out.println("null");
            }
        }
    }

    

    
}
