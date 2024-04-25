package Java8;

interface Wordcount {
    int count(String str);
}

public class MyClassWithLambda {
	
    public static void main(String[] args) {
       
        Wordcount wordcount = str -> {
            if (str == null || str.isEmpty()) {
                return 0;
            }
           
            String[] words = str.split("\\s+");
            return words.length;
        };

        
        String exampleString = "Hello world! This is a sample string.";
        
        System.out.println("Number of words in the string: " + wordcount.count(exampleString));
    }
}
