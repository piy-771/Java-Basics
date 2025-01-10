//WAP to accept elements of array from user , convert this array into two array of odd and even elements

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessing3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter an integer value");
            array[i] = scanner.nextInt();
        }
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
           if(array[i] % 2 == 0){
               evenCount++;
           }
           else{
               oddCount++;
           }

        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int indexOfEvenArray = 0;
        int indexOfOddArray = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                evenArray[indexOfEvenArray] = array[i];
                indexOfEvenArray++;
        }else{
                oddArray[indexOfOddArray] = array[i];
                indexOfOddArray++;
            }

        }

        System.out.println("array = " + Arrays.toString(array));
        System.out.println("Even array = " + Arrays.toString(evenArray));
        System.out.println("Odd array = " + Arrays.toString(oddArray));
    }
}

