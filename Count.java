package Java;

public class Count {
	
	 public static void main(String[] args) {
	    	
	        String str = "How was your day today";
	        
	        char c = 'a';

	        String str1 = str.toLowerCase().replace(String.valueOf(c), "");

	        int n = str.length() - str1.length();

	        System.out.println(c + " : " + n);
	    
	}

}
