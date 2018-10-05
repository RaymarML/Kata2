package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {2, 4, 4, 5, 6,
                      4, 5, 3, 1, 6,
                      8, 7, 7, 9, 9};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
