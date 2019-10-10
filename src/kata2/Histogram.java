package kata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author J0RG3PD99
 */
class Histogram implements Iterable<Integer>{
    private final Map<Integer, Integer> counts = new TreeMap();
    
    public Histogram(int ... val) {
        for (int i : val) {
            counts.put(i, counts.getOrDefault(i,0)+1);
        }
    }

    public int getCount(int c) {
        return counts.get(c);
    }

    @Override
    public Iterator<Integer> iterator() {
        return counts.keySet().iterator();
    }
}
