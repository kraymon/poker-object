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

    public boolean beats(Player b){
        String combinaisonB= getCombinaison(b.hand); //Brelan / PAIRE / CARRE / RIEN
        String combinaisonA= getCombinaison(this.hand);//Brelan / PAIRE / CARRE / RIEN
        String valeurA = getValeurCombinaison(this.hand,combinaisonA);
        String valeurB = getValeurCombinaison(b.hand,combinaisonB);


        if (compareCombinaison(combinaisonA,combinaisonB).equals(combinaisonA)){
            return true;
        }

        else if (compareCombinaison(combinaisonA,combinaisonB).equals(combinaisonB)){
            return false
        }

        else{
            if(compareValeur(combinaisonA,combinaisonB).equals(combinaisonA)){
                return true;
            }

            else{
                return false;
            }
        }



        //getCombinaison(une main) : donne les combinaison (paire, brelan, carre, rien), renvoie String.
        //compareCombinaison(2 combinaison(String))=donne la combinaison gagante(String)
        //compareValeur(2 valeur(String)): donne la valeur gagnante(String)
        //getValeurCombinaison(hand,combinaison) : retourne une valeur (String)
    }

    public String[] getCombinaison(Card[] main){
        int countMax=1;
        String valeur ="";
        for(Card c : main){
            int count=0;
            for(Card c2 : main){
                if(c.getValeur().equals(c2.getValeur())){
                    count++;

                }
            }
            if(count>countMax){
                countMax=count;
                valeur = c.getValeur();
            }
        }
        if(countMax==2){
            String[] combi ={"pair",valeur};
            return combi;
        }

        else if(countMax==3){
            String[] combi ={"brelan",valeur};
            return combi;
        }

        else if(countMax==4){
            String[] combi ={"carre",valeur};
            return combi;
        }

        String[] combi ={"rien",valeur};
        return combi;
        
    }
    

    
}

    

    

