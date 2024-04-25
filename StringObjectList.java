package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringObjectList {

	    public static void main(String[] args) {

	        List<String> strings = Arrays.asList("apple", "", "banana", "orange", "", "table", "box");

	        long count5 = strings.stream().filter(s -> s.length() > 5).count();
	        
	        long countEmpty = strings.stream().filter(String::isEmpty).count();
	        
	        List<String> empty = strings.stream().filter(String::isEmpty).collect(Collectors.toList());

	        System.out.println("Number of strings whose length is greater than 5: " + count5);
	        
	        System.out.println("Number of empty strings: " + countEmpty);
	        
	        System.out.println("Empty strings: " + empty);
	    
	}

}
