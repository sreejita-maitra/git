package Java;

import java.util.Arrays;
import java.util.Scanner;

public class Second{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargest(array);

      
        System.out.println("The second largest number in the array is: " + secondLargest);

        scanner.close();
    }

   
    public static int findSecondLargest(int[] array) {
       
        Arrays.sort(array);

      
        int n = array.length;
        if (n < 2) {
            System.out.println("Array size is less than 2");
            return -1; 
        }

        int largest = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] < largest) {
                return array[i];
            }
        }

       
        return largest;
    }
}


