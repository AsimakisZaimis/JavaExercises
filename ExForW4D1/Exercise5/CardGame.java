
package exercise5;


public abstract class CardGame {

    
    public void shuffle(){
        System.out.println("Shuffle like a CardGame");
    }
    
    public abstract void deal();
    
    public abstract void displayRules();
    
    
    public abstract void keepScore();
    
}
