package Java8;

import java.time.LocalDate;
import java.time.Period;

public class Experience {
	
	
	    public static void main(String[] args) {
	       
	        LocalDate startDate = LocalDate.of(2019, 7, 31); 
	        
	        LocalDate endDate = LocalDate.now();

	        Period period = Period.between(startDate, endDate);

	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        System.out.println("Experience at Wipro:");
	        System.out.println("Years: " + years);
	        System.out.println("Months: " + months);
	        System.out.println("Days: " + days);
	    
	}

}
