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
        getHandString();
        System.out.println("Entrer le nombre de carte que vous souhaitez echanger : ");
        int nbDiscard = sc.nextInt();
        Card[] card = new Card[nbDiscard];
        for(int i =0; i<nbDiscard;i++){
            System.out.println("Entrer le numero de la carte que vous souhaitez echanger : ");
            int indexDiscard = sc.nextInt();
            card[i]=hand[indexDiscard];
            hand[indexDiscard]=null;
        }



        return card;

    }

    
    public void addCard(Card[] newCard){
        //à definire
        for(Card c : newCard){
            for(int i =0;i<this.hand.length;i++){
                if(this.hand[i]==null){
                    this.hand[i]=c;
                    break;
                }
            }
        }
        getHandString();

    }

    public void getHandString(){
        //à definire

        int i = 0;
        for(Card c : this.hand){
            if(c!=null){
                System.out.println(c.getValeur()+" "+c.getCouleur()+" ("+i+")");
            }
            else{
                System.out.println("null");
            }
            i++;
        }
            
    }

    public void beats(Player b){

    }

    
}

    

    

