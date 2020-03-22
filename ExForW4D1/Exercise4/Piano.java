
package exercise4;


public class Piano extends MusicalInstrument {

    @Override
    public void playNote(){
        System.out.println("Playing notes as a piano");
    }
    
    
    @Override
    public void outputSound(){
        System.out.println("Sounds like a piano");
    }
}
