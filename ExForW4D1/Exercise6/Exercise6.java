
package exercise6;


public class Exercise6 {

    
    public static void main(String[] args) {
        
        System.out.println("*****Information about dog1**********");
        Dog dog1 = new SofaDog();        
        dog1.jobDiscription();
        System.out.println("*****Information about dog2**********");
        Dog dog2 = new Hound();       
        dog2.jobDiscription();
        System.out.println("*****Information about dog3***********");
        Dog dog3 = new ShepherdDog();
        dog3.jobDiscription();
    }
    
}
