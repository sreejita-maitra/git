package Java;

import java.util.ArrayList;

public class Duplicate{
	
	 public static void main(String[] args) 
	    { 
	  
	        int arr[] = {89,36,4,5,66,4,66,5,8,9,89}; 
	        
	        int n = arr.length; 
	  
	        find(arr, n); 
	    } 

	 static void find( 
		      int arr[], int len) 
		    { 
		  
		       
		        boolean ifPresent = false; 
		  
		       
		        ArrayList<Integer> al = new ArrayList<Integer>(); 
		  
		        for (int i = 0; i < len - 1; i++) { 
		            for (int j = i + 1; j < len; j++) { 
		                if (arr[i] == arr[j]) { 
		                    
		                    if (al.contains(arr[i])) { 
		                        break; 
		                    } 
		  
		                    
		                    else { 
		                        al.add(arr[i]); 
		                        ifPresent = true; 
		                    } 
		                } 
		            } 
		        } 
		  
		        
		        if (ifPresent == true) { 
		  
		            System.out.print(al + " "); 
		        } 
		        else { 
		            System.out.print( 
		                "No duplicates present in arrays"); 
		        } 
		    } 
		  
		   
}
	    	