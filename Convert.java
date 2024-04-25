package Java;

import java.util.Scanner;

public class Convert {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	
	        System.out.print("Enter a decimal number: ");
	        int decimal = scanner.nextInt();

	       
	        String binary = decimalToBinary(decimal);

	     
	        System.out.println("Binary number of " + decimal + " is: " + binary);

	        scanner.close();
	    }

	    public static String decimalToBinary(int decimal) {
	        StringBuilder binary = new StringBuilder();
	        while (decimal > 0) {
	            int remainder = decimal % 2;
	            binary.insert(0, remainder); 
	            decimal /= 2;
	        }
	        return binary.toString();
	    
	}
}
