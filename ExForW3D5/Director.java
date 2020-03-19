
package playingwithemployees;


public class Director extends Employee implements Driving , Advisable{

    

    public Director(String name, double salary) {
        super(name, salary);
    }
    
   public void guide(){
       System.out.println("Director is guiding");
   }
   
   @Override
   public void giveAdvice(){
       System.out.println("");
   }

    @Override
    public void drive() {
        System.out.println("");
    }
    
    @Override
    public void work(){
        System.out.println(name+" works like a director");
    }
   
}
