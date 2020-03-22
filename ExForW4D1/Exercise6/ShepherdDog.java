
package exercise6;


public class ShepherdDog extends WorkingDog {

    public ShepherdDog() {
        super.barking();
    }
    
    
    
    @Override
    public void jobDiscription(){
        System.out.println("Its a shepherd dog, it hunts other animals to protected the sheeps");
    }
}
