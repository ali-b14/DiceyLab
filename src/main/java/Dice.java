public class Dice {
    private Dice craps = new Dice(2);
    private Dice yatzee = new Dice(5);
    private Integer toss;

    public Dice() {
    }

    public Dice getCraps() {
        return craps;
    }

    public void setCraps(Dice craps) {
        this.craps = craps;
    }

    public Dice getYatzee() {
        return yatzee;
    }

    public void setYatzee(Dice yatzee) {
        this.yatzee = yatzee;
    }

    public Integer getToss() {
        return toss;
    }

    public void setToss(Integer toss) {
        this.toss = toss;
    }
}
