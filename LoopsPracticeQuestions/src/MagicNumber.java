import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = 8;
        int userInput;
        do {
            System.out.println("Enter magic number");
            userInput = scanner.nextInt();
            if (userInput == magicNumber) {
                System.out.println("Winner");
            } else {
                System.out.println("Try Again");
            }
        } while (userInput != 0 && userInput != magicNumber);
    }
}
