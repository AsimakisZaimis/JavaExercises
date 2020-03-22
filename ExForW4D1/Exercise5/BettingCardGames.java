
package exercise5;


public class BettingCardGames extends CardGame{
    
     @Override
    public void deal(){
        System.out.println("Dealing like BettingCardGames");
    }
    
    @Override
    public void displayRules(){
        System.out.println("DisplayRules like BettingCardGames");
    }
    
    @Override
    public void keepScore(){
        System.out.println("KeepingScore like BettingCardGames");
    }
}
