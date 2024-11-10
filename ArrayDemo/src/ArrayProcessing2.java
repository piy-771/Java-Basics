import java.util.Scanner;

public class ArrayProcessing2 {
    public static void main(String[] args) {
        //wap to accept elements from the user , calculate and print the sum and average of elements;
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] intArray = new int[size];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter a element");
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }
        System.out.println("sum = " + sum);
        double average = (double)sum/intArray.length;
        System.out.println("average = " + average);

    }
}
