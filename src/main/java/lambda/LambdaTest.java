package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        String [] planets = {"Mercury", "Venera", "Earth", "Neptun", "Pluton"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length ");
        Arrays.sort (planets, (first, second) ->
    first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        t.start();
        JOptionPane.showInputDialog(null, "Enter a number");
        JOptionPane.showMessageDialog(null, "Exit the window?");
        System.exit(0);




    }
}
