/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Histogram {
    private final int[] data;
    
    public Histogram(int[] data){
        this.data=data;
    }
    
    public int[] getData(){
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
