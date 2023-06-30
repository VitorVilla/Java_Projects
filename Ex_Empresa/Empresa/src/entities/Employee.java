package entities;

public class Employee {

    private String nome;
    protected int hours;
    protected double valuePerhour;

    public Employee() {
    }

    public Employee(String nome, int hours, double valuePerhour) {
        this.nome = nome;
        this.hours = hours;
        this.valuePerhour = valuePerhour;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public double payment() {
        double total = hours * valuePerhour;
        return total;
    }
}
