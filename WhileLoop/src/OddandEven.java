import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second integer");
        int secondNumber = scanner.nextInt();
        if(firstNumber > 0 && secondNumber > 0 && firstNumber%2 != 0 && secondNumber %2==0){
            System.out.println("Multiplication = " + firstNumber*secondNumber);
        }
    }
}
