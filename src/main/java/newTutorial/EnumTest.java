package newTutorial;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one of the sizes: Small, Medium, Large, Extra");
        String input = in.nextLine().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size = " + size);
        System.out.println("Abbreviation of size: " + size.getAbbreviation());

        if(size==Size.EXTRALARGE){
            System.out.println("Good job, guys");
        }

    }
}
