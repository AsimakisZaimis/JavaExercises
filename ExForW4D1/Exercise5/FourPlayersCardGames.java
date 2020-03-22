
package exercise5;


public class FourPlayersCardGames extends CardGame{
 
     @Override
    public void deal(){
        System.out.println("Dealing like FourPlayerCardGames");
    }
    
    @Override
    public void displayRules(){
        System.out.println("DisplayRules like FourPlayerCardGames");
    }
    
    @Override
    public void keepScore(){
        System.out.println("KeepingScore like FourPlayerCardGames");
    }
}
