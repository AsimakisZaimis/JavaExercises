
package exercise5;


public class Exercise5 {

    
    public static void main(String[] args) {
        CardGame game1  = new TwoPlayerCardGames();
        CardGame game2 = new BettingCardGames();
        game1.deal();
        game1.shuffle();
        game2.displayRules();
        game2.keepScore();
    }
    
}
