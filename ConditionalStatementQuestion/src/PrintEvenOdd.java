//Write a program to accept an integer from user and print even if the number is even, Otherwise print odd.

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer = scanner.nextInt();
        if(integer%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
