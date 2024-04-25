package Java;
	
import java.util.Scanner;

	public class Word{
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter a string: ");
	        
	        String str = scanner.nextLine();
	        
            str = str.trim();
	                
	        String[] words = str.split("\\s+");
	        
	       
	        System.out.println("Number of words in the string: " + words.length);
	        
	        scanner.close();
	    }
	    

}
