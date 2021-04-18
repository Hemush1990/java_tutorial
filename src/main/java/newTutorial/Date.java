package newTutorial;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        LocalDate newYear = LocalDate.of(2020, 01, 01);
        System.out.println(newYear.getChronology());
        System.out.println(newYear.getDayOfMonth());
        System.out.println(newYear.getDayOfWeek());
        LocalDate trial = LocalDate.now();

        LocalDate trialDay = trial.plusDays(7);
        System.out.println(trialDay);


        GregorianCalendar someday = new GregorianCalendar(1991, 11, 31 );
        someday.get(Calendar.YEAR);
    }
}
