package Java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Sunday {

    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();
                
        LocalDate firstDayOfNextMonth = currentDate.plusMonths(1).withDayOfMonth(1);
        
        LocalDate secondSundayOfNextMonth = firstDayOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).plusWeeks(1);
        
        System.out.println("Date of the second Sunday of next month: " + secondSundayOfNextMonth);
    }
}

