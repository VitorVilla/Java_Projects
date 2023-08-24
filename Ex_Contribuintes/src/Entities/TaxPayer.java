package Entities;

public abstract class TaxPayer {
    private String name;
    private double anualincome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double anualincome) {
        this.name = name;
        this.anualincome = anualincome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualincome() {
        return anualincome;
    }

    public void setAnualincome(double anualincome) {
        this.anualincome = anualincome;
    }

    public abstract double tax();

}
