
package exercise4;


public class Violin extends MusicalInstrument {

    @Override
    public void playNote(){
        System.out.println("Playing notes as a violin");
    }
    
    
    @Override
    public void outputSound(){
        System.out.println("Sounds like a violin");
    }
}
