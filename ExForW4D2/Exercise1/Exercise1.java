
package exercise1;

import java.util.ArrayList;
import java.util.Iterator;



public class Exercise1 {
    
    
    public static void main(String[] args) {
        
        
        Bunny bunny1 = new Bunny(10);
        
        Bunny bunny2 = new Bunny(14);
        
        Bunny bunny3 = new Bunny(20);
        
        Bunny bunny4 = new Bunny(43);
        
        Bunny bunny5 = new Bunny(5);
       
        
        ArrayList<Bunny> listOfBunnies = new ArrayList();
        listOfBunnies.add(bunny1);
        listOfBunnies.add(bunny2);
        listOfBunnies.add(bunny3);
        listOfBunnies.add(bunny4);
        listOfBunnies.add(bunny5);
         
         
        for(int i=0; i<listOfBunnies.size(); i++){
            listOfBunnies.get(i).hop();
        }
        
        Iterator<Bunny> iterator = listOfBunnies.iterator();
        while(iterator.hasNext()){
            Bunny tempBunny = iterator.next();
            tempBunny.hop();
        }
        
        
        
        
    }

  
    
}
