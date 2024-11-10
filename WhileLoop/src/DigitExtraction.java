import java.util.Scanner;

public class DigitExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            System.out.print(digit);
            if (number != 0) {
                System.out.print(", ");
            }

        }



    }
}
