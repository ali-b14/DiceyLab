public class Simulation {
    private Integer numberOfDies;
    private Integer numberOfTosses;

    Bins bin = new Bins();//How should create the bin object so I can save the results into it? Would I be able to directly save the results into the bins class

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }
}
