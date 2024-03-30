import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dice {

    private List<Integer> dices = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    int toss;
    Random random = new Random();


    public Dice(int toss) {
        this.toss = toss;
    }

//    public static void main(String[] args) {
//        Dice dice = new Dice();
//        System.out.println(dice.tossAndSum());
//    }

    public Integer tossAndSum(int toss){
        toss = 2;
        Integer sum = 0;
        Integer value;
        for (int i = 0; i < toss; i++) {
            value = dices.get(random.nextInt(dices.size()));
            sum += value;
        }
        return sum;
    }

}
