package Java;

public class Even {
	
	    public static void main(String[] args) {
	    	
	        String str = "hai welcome to the java program";
	        
	        String[] arr = str.split(" ");
	        
	        for (String s : arr) {
	        	
	        if (s.length() % 2 == 0) {
	            	
	        System.out.println(s + " -> " + s.length());
	            
	        }
	    }
	}

}
