import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i >0; i--) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }
}
