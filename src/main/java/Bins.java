import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bins {
    private Map<Integer, Integer> bins = new HashMap<>();


    public Bins(Map bins) {
        this.bins = bins;
    }
    public Map<Integer, Integer> getBins() {
        return bins;
    }
//    public void updateValue(Integer key, Integer value){
//        bins.put(bins.merge(bins.size(), 1, Integer::sum));
//    }
    public void updateValue(Integer key, Integer value){
        bins.put(key, bins.merge(key, value, Integer::sum));
    }


}
