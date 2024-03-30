import java.util.*;

public class Dice {

    private final List<Integer> dice = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    private int toss;
    private int numberOfDice;
    private int sum = 0;
    Random random = new Random();
    private Bins bins;
    private Simulation simulation;
    Map<Integer,Integer> diceTracker = new HashMap<>();
    public Dice(int numberOfDice,int toss) {
        this.numberOfDice = numberOfDice;
        this.toss = toss;
        this.bins = new Bins();//initialize Bins object
//        this.simulation = new Simulation(2,10);
    }
//    public static void main(String[] args) {
//        Dice dice = new Dice(2, 3);
//        System.out.println(dice.tossAndSum(2,3));
//    }
    public Integer tossAndSum(int numberOfDice, int toss) {
        for (int i = 0; i < toss; i++) {
            sum =0;
//            System.out.println("Toss number: " + (i + 1));
            for (int j = 0; j < numberOfDice; j++) {
                int value = dice.get(random.nextInt(dice.size()));
//                System.out.println("Dice value = " + value);
                sum += value;
//                System.out.println("Sum: " + sum);
            }
//            System.out.println(numberOfDice + " dice have been rolled and the sum = " + sum);
            bins.updateValue(sum,1);
//            System.out.println(bins.getDiceTracker());
        }
        System.out.println(bins.getDiceTracker());
        return sum;
    }
    public List<Integer> getDice() {
        return dice;
    }
    public int getToss() {
        return toss;
    }
    public void setToss(int toss) {
        this.toss = toss;
    }
    public int getSum() {
        return sum;
    }
}
