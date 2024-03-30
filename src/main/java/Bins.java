import java.util.HashMap;
import java.util.Map;

public class Bins {
    private Map<Integer,Integer> diceTracker;
    public Bins() {
        diceTracker = new HashMap<>();
    }
    public Map<Integer,Integer> getDiceTracker() {
        return diceTracker;
    }
    public void updateValue(Integer key, Integer value){
        diceTracker.put(key, diceTracker.merge(key, value, Integer::sum));
    }

}
