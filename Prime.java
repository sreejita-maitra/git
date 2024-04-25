package Java;

import java.util.Scanner;

public class Prime {
	 
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        
	        int num = scanner.nextInt();
	        
	        boolean isPrime = isPrime(num);
	        
	      
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }
	    
	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    
	}
}