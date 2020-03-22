
package exercise4;


public class Exercise4 {

   
    public static void main(String[] args) {
        MusicalInstrument p1 = new Piano();
        MusicalInstrument v1 = new Violin();
        MusicalInstrument d1 = new Drum();
        p1.playNote();
        v1.outputSound();
        d1.playNote();
    }
    
}
