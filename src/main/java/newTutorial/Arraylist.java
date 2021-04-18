package newTutorial;

/*
  arraylist
 @version 1.0.1
 @author Hemush
 */

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Employe> staff = new ArrayList<>();
        staff.add(new Employe("Karl", 12, 10));
        staff.add(new Employe("Jake", 2300, 12));
        staff.add(new Employe("Zeva", 1230, 23));

        for(Employe e: staff){
            e.getSalary();

        }

        for(Employe e: staff){
            System.out.println(e.getName() +" "+ e.getSalary());
        }

    }
}
