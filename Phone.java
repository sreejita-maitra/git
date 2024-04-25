package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone {

	  public static void main(String[] args) {
	       
	        Map<String, String> map = new HashMap<>();
	        
	        map.put("Mary", "656546456");
	        map.put("Alice", "989767554");
	        map.put("Jane", "781232445");
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a name : ");
	            
	        String name = scanner.nextLine();
	    
	        String phoneNumber = map.get(name);
	                 
	        System.out.println("Phone number " + ": " + phoneNumber);
	                
	        scanner.close();
	    
	}
}
