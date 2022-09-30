package fr.pantheonsorbonne.cri;
import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    public static final int handSize=5;
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
        System.out.println(getHandString());
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
        System.out.println(getHandString());

    }

    public String getHandString(){
        //à definire

        String main="";
        int i =0;
        for(Card c : this.hand){
                main+= c.getValeur()+" "+c.getCouleur()+" ("+i+")\n";
                i++;

        }
        return main;
            
    }

    public boolean beats(Player b){
        String combinaisonB= getCombinaison(b.hand)[0]; //Brelan / PAIRE / CARRE / RIEN
        String combinaisonA= getCombinaison(this.hand)[0];//Brelan / PAIRE / CARRE / RIEN
        String valeurA = getCombinaison(this.hand)[1];
        String valeurB = getCombinaison(b.hand)[1];


        if (compareCombinaison(combinaisonA,combinaisonB).equals(combinaisonA)){
            return true;
        }

        else if (compareCombinaison(combinaisonA,combinaisonB).equals(combinaisonB)){
            return false;
        }

        else{
            if(compareValeur(valeurA,valeurB).equals(valeurA)){
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
        ArrayList <Card> carteMaxVal = new ArrayList<>();
        String valeur="";
        int countPaire=0;
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

            if(count==2){
                carteMaxVal.add(c);
                countPaire++;
            }
            
        }

        if(countPaire==2){
            valeur = compareValeur(carteMaxVal.get(0).getValeur(),carteMaxVal.get(1).getValeur());
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

    public int valeurCombinaison(String combi){
        if(combi.equals("carre")){
            return 4;
        }
        else if(combi.equals("brelan")){
            return 3;
        }
        else if(combi.equals("pair")){
            return 2;
        }
        else{
            return 1;
        }
    }
    public String compareCombinaison(String combiA, String combiB){
        int valA = valeurCombinaison(combiA);
        int valB = valeurCombinaison(combiB);
        if(valA>valB){
            return combiA;
        }
        else if(valA<valB){
            return combiB;
        }
        else{
            return "draw";
        }


    }

    public String compareValeur(String valeur1,String valeur2){
        int val1=valeurValeur(valeur1);
        int val2=valeurValeur(valeur2);

        if(val1>val2){
            return valeur1;
        }
        else if(val1<val2){
            return valeur2;
        }
        else{
            return "draw";
        }

    }

    public int valeurValeur(String valeur){
        if(valeur.equals("AS")){
            return 13;
        }

        else if(valeur.equals("ROI")){
            return 12;
        }

        else if(valeur.equals("DAME")){
            return 11;
        }

        else if(valeur.equals("VALET")){
            return 10;
        }

        else if(valeur.equals("DIX")){
            return 9;
        }

        else if(valeur.equals("NEUF")){
            return 8;
        }

        else if(valeur.equals("HUIT")){
            return 7;
        }

        else if(valeur.equals("SEPT")){
            return 6;
        }

        else if(valeur.equals("SIX")){
            return 5;
        }

        else if(valeur.equals("CINQ")){
            return 4;
        }

        else if(valeur.equals("QUATRE")){
            return 3;
        }

        else if(valeur.equals("TROIS")){
            return 2;
        }

        else{
            return 1;
        }
    }


















        

        


}


    

    

