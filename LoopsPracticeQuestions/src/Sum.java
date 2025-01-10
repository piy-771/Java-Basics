import  java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int value;
        do{
            System.out.println("Enter a value to sum or enter 0 to stop");
            value = scanner.nextInt();
            sum += value;
        }while (value != 0);
        System.out.println("Sum = " + sum);
    }
}
