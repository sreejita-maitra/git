package Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);       
        
        System.out.print("Enter a string: ");
        
        String str = scanner.nextLine();
        
        String rev = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
        	
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
        
        scanner.close();
    }
            
}

