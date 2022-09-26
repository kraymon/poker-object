package fr.pantheonsorbonne.cri;

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
    }

    public void addCard(){
        //à definire
    }

    public void getHandString(){
        //à definire
    }

    
}
