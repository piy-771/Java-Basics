//Write a program to accept three numbers from user and print all are divisible by 9, if all three numbers are divisible by 9.

import java.util.Scanner;

public class DivisibleByNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        if(firstNumber%9 == 0 && secondNumber%9 == 0 && thirdNumber%9 == 0){
            System.out.println("All are divisible by 9");
        }
    }
}
