import java.util.Scanner;

public class DemoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number");
        int number3 = scanner.nextInt();
        if(number1 == number2 && number2 == number3){
            System.out.println("bingo");
        }else if (number1 != number2 && number2 != number3){
            System.out.println("try again");
        }else{
            System.out.println("team");
        }
    }
}
