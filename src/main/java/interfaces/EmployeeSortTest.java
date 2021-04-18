package interfaces;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("Peter", 2300);
        staff[1] = new Employee("Jake", 4500);
        staff[2] = new Employee("Mary", 5500);

        Arrays.sort(staff);

        for(Employee e: staff){
            System.out.println(e.getName() + " " + e.getSalary());
        }

    }
}
