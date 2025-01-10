import java.util.Scanner;

public class SumPowerDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        double sum = 0;
        double temp = 0;
        while (number != 0) {
            int digit = number % 10;
            double power = Math.pow(digit,temp);
            sum += power;
            temp = digit;
            number = number / 10;
        }
        System.out.println("Sum = " + sum);
    }
}
