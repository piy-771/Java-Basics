//Write a program to accept an integer from user and print positive, if the number is positive. Otherwise, print negative. Considering number can never be equal to zero.

import java.util.Scanner;

public class PrintPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer = scanner.nextInt();
        if(integer>0){
            System.out.println("Positive");
        } else if (integer < 0) {
            System.out.println("Negative");
        }
    }
}
