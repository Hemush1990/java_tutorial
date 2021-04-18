package newTutorial;

import javafx.scene.shape.Path;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        StringBuilder moy = new StringBuilder();
        moy.append("Lazy ");
        moy.append("\nYou are so lazy");
        moy.toString();

        System.out.println(moy.length());
        moy.delete(1, 2);
        System.out.println(moy);

        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();

        System.out.println(moy + " " + name1);
        String name = in.nextLine();
        Integer age = in.nextInt();


        System.out.printf("Hello, %s. Next year you'll be %d", name, age);

        System.out.printf("\n-3333");

        System.out.printf("%tc", new Date()); //date current

        System.out.printf("\n%1$s %2$tB %2$te, %2$tY",
                "Actual date: ", new Date());

        Scanner n = new Scanner("file.txt");

        PrintWriter out = new PrintWriter("file1.txt", String.valueOf(StandardCharsets.UTF_8));

    }
}
