//Write a program to accept three numbers from user and print equals if the numbers are equal.

import java.util.Scanner;

public class ThreeNumberEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter Third Number");
        int thirdNumber = scanner.nextInt();
        if(firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println("Equals");
        }
    }
}
