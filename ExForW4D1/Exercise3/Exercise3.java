
package exercise3;


public class Exercise3 {

    
    public static void main(String[] args) {
        Division company1 = new InternationalDivision("Greece", "Greek", "Eurobank", 1234);
        Division company2 = new DomesticDivision("Attica", "OTE", 321);
        
        company1.display();
        company2.display();
        
    }
    
}
