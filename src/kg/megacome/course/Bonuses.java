package kg.megacome.course;

public class Bonuses {

    private String additions;
    private int amountOf;

    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }

    public int getAmountOf() {
        return amountOf;
    }

    public void setAmountOf(int amountOf) {
        this.amountOf = amountOf;
    }

    public Bonuses(String additions, int amountOf) {
        this.additions = additions;
        this.amountOf = amountOf;
    }

    @Override
    public String toString() {
        return "Bonuses{" +
                "additions='" + additions + '\'' +
                ", amountOf=" + amountOf +
                '}';
    }
}
