//Write a program to accept two numbers from user, if the both the numbers are positive, get the remainder of the division by 5 for both the numbers. If remainder of both the division are equal print numbers are equal, otherwise number are not equal. If one or both the numbers are negative, print calculation not possible.

import java.util.Scanner;

public class PositiveAndEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();
        if (firstNumber > 0 && secondNumber > 0) {
            int remainderOfFirstNumber = firstNumber % 5;
            int remainderOfSecondNumber = secondNumber % 5;
            if (remainderOfFirstNumber == remainderOfSecondNumber) {
                System.out.println("Numbers are equal");
            }else {
                System.out.println("Numbers are not equal");
            }
        }else {
            System.out.println("Calculation not possible");
        }
    }
}
