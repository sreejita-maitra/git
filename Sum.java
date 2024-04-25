package Java;
import java.util.Scanner;

public class Sum {

	   public static void main(String[] args) {
	        
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the length of the array: ");
	        int size = scanner.nextInt();

	   
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	       
	        int sumOfPrimes = findSumOfPrimes(array);

	        
	        System.out.println("Sum of all prime numbers in the array: " + sumOfPrimes);

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

	    
	    public static int findSumOfPrimes(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            if (isPrime(num)) {
	                sum += num;
	            }
	        }
	        return sum;
	    
	}

}
