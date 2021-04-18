package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee  implements Cloneable{
    private String name;

    private double salary;
    private Date hiredate;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hiredate = new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        cloned.hiredate = (Date) hiredate.clone();
        return cloned;
    }

    public void setHiredate(int year, int month, int day) {
        Date newHireDate = new GregorianCalendar(year, month-1, day).getTime();
        hiredate.setTime(newHireDate.getTime());
    }

    public void getSalary(double percent){
        double raise = percent * salary/100;
        salary+=raise;

    }

    @Override public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }


}
