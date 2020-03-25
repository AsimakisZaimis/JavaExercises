package exercise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Exercise2 {

    public static void main(String[] args) {

        Bunny bunny1 = new Bunny(10);

        Bunny bunny2 = new Bunny(14);

        Bunny bunny3 = new Bunny(20);

        Bunny bunny4 = new Bunny(43);

        Bunny bunny5 = new Bunny(52);

        
        Map<Bunny, Integer> map = new LinkedHashMap();
        map.put(bunny1, bunny1.getBunnyNumber());
        map.put(bunny2, bunny2.getBunnyNumber());
        map.put(bunny3, bunny3.getBunnyNumber());
        map.put(bunny4, bunny4.getBunnyNumber());
        map.put(bunny5, bunny5.getBunnyNumber());

        
        Set<Map.Entry<Bunny, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Bunny, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Bunny, Integer> entry = iterator.next();
            entry.getKey().hop();
            
        }
    }

}
