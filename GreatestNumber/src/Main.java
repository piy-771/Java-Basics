import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter Second Number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter Third Number");
        double thirdNumber = scanner.nextDouble();
        scanner.close();
        if(firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber){
            System.out.println("No need to find greatest number");
        }else{
            if(firstNumber > secondNumber && firstNumber > thirdNumber){
                System.out.println("First Number is greatest");
            }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
                System.out.println("Second Number is greatest");
            }else{
                System.out.println("Third Number is greatest");
            }
        }



    }
}