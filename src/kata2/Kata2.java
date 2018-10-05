package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {2, 4, 4, 5, 6,
                      4, 5, 3, 1, 6,
                      8, 7, 7, 9, 9};
        
        Map<Integer, Integer> histogram = new HashMap();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
