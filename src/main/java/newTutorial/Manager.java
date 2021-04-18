package newTutorial;

public class Manager extends Employe{
    private double bonus;


    public Manager(String name, double salary, int id, double bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }


    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
