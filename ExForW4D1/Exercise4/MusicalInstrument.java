
package exercise4;


public class MusicalInstrument {
     
    
    public void playNote(){
        if(this instanceof Piano){
            System.out.println("Playing notes as a piano");
        }
        if(this instanceof Violin){
            System.out.println("Playing notes as a violin");
        }
        if(this instanceof Drum){
            System.out.println("Playing notes as a drum");
        }
    }
    
    public void outputSound(){
        if(this instanceof Piano){
            System.out.println("Sounds like a piano");
        }
        if(this instanceof Violin){
            System.out.println("Sounds like a violin");
        }
        if(this instanceof Drum){
            System.out.println("Sounds like a drum");
        }
    }
    
}
