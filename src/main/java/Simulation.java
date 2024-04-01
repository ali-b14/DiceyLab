public class Simulation {
    private int numberOfDice; //throw 2-5 dies
    private int numberOfTosses; //throw up to 1 million times
    private Bins bins;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.bins = new Bins();
    }
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,1000000);
        simulation.run();
    }
    public void run(){
        Dice dice = new Dice(numberOfDice,numberOfTosses);
        dice.tossAndSum(numberOfDice,numberOfTosses);
    }
    public Integer throwDice(){
        return null;
    }
}
