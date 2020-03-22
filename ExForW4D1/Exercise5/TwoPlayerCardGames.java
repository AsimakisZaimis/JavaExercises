
package exercise5;


public class TwoPlayerCardGames extends CardGame{
    
    @Override
    public void deal(){
        System.out.println("Dealing like TwoPlayerCardGames");
    }
    
    @Override
    public void displayRules(){
        System.out.println("DisplayRules like TwoPlayerCardGames");
    }
    
    @Override
    public void keepScore(){
        System.out.println("KeepingScore like TwoPlayerCardGames");
    }
}
