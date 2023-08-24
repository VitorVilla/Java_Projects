package Entities;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, double anualincome, double healthExpenditures) {
        super(name, anualincome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double total;
        if (getAnualincome() < 20000) {
            total = 0.15 * getAnualincome();
        } else {
            total = 0.25 * getAnualincome();
        }

        if (healthExpenditures > 0) {
            total -= 0.50 * getHealthExpenditures();
        }
        return total;
    }

}
