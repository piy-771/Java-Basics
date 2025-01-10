import java.util.Scanner;

public class SumAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int value;
        do{
            System.out.println("Enter a value for sum or enter 0 for stop");
            value = scanner.nextInt();
            sum ++;
            count ++;
        }while (value != 0);
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
    }
}
