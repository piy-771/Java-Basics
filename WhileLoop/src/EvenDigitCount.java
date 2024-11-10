import java.util.Scanner;

public class EvenDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int countEven = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                countEven++;
            }
            number = number / 10;
        }
        System.out.println("Even digits = " + countEven);
    }
}