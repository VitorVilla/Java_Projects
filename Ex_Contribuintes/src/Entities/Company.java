package Entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, double anualincome, int numberOfEmployees) {
        super(name, anualincome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double total;
        if (numberOfEmployees > 10) {
            total = 0.14 * getAnualincome();
        } else {
            total = 0.16 * getAnualincome();
        }
        return total;
    }

}
