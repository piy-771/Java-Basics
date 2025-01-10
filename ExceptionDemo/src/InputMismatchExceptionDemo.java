import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        try{
            int x = scanner.nextInt();

            System.out.println(x);
        }catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException);
        }

    }
}
