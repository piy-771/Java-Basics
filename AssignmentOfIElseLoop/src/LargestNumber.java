import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Three number");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber + " is greatest");
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber + " is greatest");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println(thirdNumber + " is greatest");
        }else{
            System.out.println("All number are equals");
        }
    }
}
