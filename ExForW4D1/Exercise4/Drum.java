
package exercise4;


public class Drum extends MusicalInstrument{
 
    @Override
    public void playNote(){
        System.out.println("Playing notes as a drum");
    }
    
    
    @Override
    public void outputSound(){
        System.out.println("Sounds like a drum");
    }
}
