import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dice {

    private final List<Integer> dice = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
    int toss;
    int numberOfDice;
    int sum = 0;
    Random random = new Random();


    public Dice(int numberOfDice,int toss) {
        this.numberOfDice = numberOfDice;
        this.toss = toss;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(2, 3);
        System.out.println(dice.tossAndSum(2,3));
    }

    public Integer tossAndSum(int numberOfDice, int toss) {

        for (int i = 0; i < toss; i++) {
            sum =0;
            System.out.println("Toss number: " + (i + 1));
            for (int j = 0; j < numberOfDice; j++) {
                int value = dice.get(random.nextInt(dice.size()));
                System.out.println("Dice value = " + value);
                sum += value;
                System.out.println("Sum: " + sum);
            }
            System.out.println(numberOfDice + " dice have been rolled and the sum = " + sum);
        }
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
