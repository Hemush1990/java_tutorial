package Exercices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise46 {
    public static void main(String[] args) {
        DateTimeFormatter dat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate now = LocalDate.now();
        System.out.println(dat.format(now));
    }
}
