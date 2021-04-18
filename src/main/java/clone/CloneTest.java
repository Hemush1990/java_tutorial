package clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee original = new Employee("Suzan", 3400);
        original.setHiredate(2029, 06,23);
        Employee copy = original.clone();
        copy.getSalary(25);
        copy.setHiredate(2018, 04, 13);
        System.out.println("original " + original);
        System.out.println("copy " + copy);

    }
}