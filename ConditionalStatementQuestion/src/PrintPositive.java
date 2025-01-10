//Write a program that accept an integer form user and print positive, if the integer is positive.

import java.util.Scanner;

public class PrintPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer = scanner.nextInt();
        if(integer>0){
            System.out.println("Positive");
        }
    }
}
