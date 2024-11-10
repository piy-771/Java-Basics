//Write a program that accept two numbers from the user and print equals if the numbers are equal.

import java.util.Scanner;

public class TwoNumberEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber = scanner.nextInt();
        if(firstNumber == secondNumber){
            System.out.println("Equals");
        }
    }
}
