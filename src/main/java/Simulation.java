import java.util.Map;

public class Simulation {
    private int numberOfDies; //throw 2-5 dies
    private int numberOfTosses; //throw up to 1 million times
    Bins bins = new Bins();
    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }
    Dice dice = new Dice(2,5);
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,5);
        simulation.run();
    }
    public void run(){
        dice.tossAndSum(2,1000000);
    }
    public Integer throwDice(){
        return null;
    }
}
