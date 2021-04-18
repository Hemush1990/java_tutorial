package newTutorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {


    public static void main(String[] args) {

        EmployeeTest [] staff = new EmployeeTest[3];
        staff [0] = new EmployeeTest("Kolince Peter", 2000, 2010, 2, 20);
        staff [1] = new EmployeeTest("Seven Semen", 2500, 2015, 8, 13);
        staff[2] = new EmployeeTest("Mark Anthony", 3000, 2018, 3, 24);

        for (EmployeeTest person: staff){
            person.raiseSalary(10);
            System.out.println(person.getName());
            System.out.println(person.getSalary());
        }

        for (EmployeeTest person: staff){
            System.out.println(person.getName() + ' ' + person.getHiredate() + ' ' + person.raiseSalary(15));
        }
    }
}

class EmployeeTest{
    private String name;



    private int salary;
    private LocalDate hiredate;

    public EmployeeTest(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hiredate = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public double raiseSalary(double perscent){
        double raise = salary * perscent/100;
        salary += raise;
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }

}