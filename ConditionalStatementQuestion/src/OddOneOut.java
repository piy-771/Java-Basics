/*Pick the odd one out - Write a program to accept four numbers from user and print the odd one among them.

Number can be odd among others in following scenario:
if three numbers are equal, then the different one is odd one among them.
if three number are even, then the different one is odd one among them.
if three number are odd, then the different one is odd one among them.
if all are different, even or odd, then print no number is odd one among them.
*/

import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter Third Number");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter Fourth Number");
        int fourthNumber = scanner.nextInt();
        if (firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber != fourthNumber) {
            System.out.println("Odd one is " + fourthNumber);
        } else if (firstNumber == fourthNumber && secondNumber == firstNumber && firstNumber != thirdNumber) {
            System.out.println("Odd one is " + thirdNumber);
        } else if (secondNumber == thirdNumber && thirdNumber == fourthNumber && secondNumber != firstNumber) {
            System.out.println("Odd one is " + firstNumber);
        } else if (firstNumber == thirdNumber && thirdNumber == fourthNumber && firstNumber != secondNumber) {
            System.out.println("Odd one is " + secondNumber);
        } else if (firstNumber % 2 == 0 && secondNumber % 2 == 0 && thirdNumber % 2 == 0 && fourthNumber % 2 != 0) {
            System.out.println("Odd one is " + fourthNumber);
        } else if (firstNumber % 2 == 0 && secondNumber % 2 == 0 && fourthNumber % 2 == 0 && thirdNumber % 2 != 0) {
            System.out.println("Odd one is " + thirdNumber);
        } else if (firstNumber % 2 == 0 && thirdNumber % 2 == 0 && fourthNumber % 2 == 0 && secondNumber % 2 != 0) {
            System.out.println("Odd one is " + secondNumber);
        } else if (secondNumber % 2 == 0 && thirdNumber % 2 == 0 && fourthNumber % 2 == 0 && firstNumber % 2 != 0) {
            System.out.println("Odd one is " + firstNumber);
        } else if (firstNumber % 2 != 0 && secondNumber % 2 != 0 && thirdNumber % 2 != 0 && fourthNumber % 2 == 0) {
            System.out.println("Odd one is " + fourthNumber);
        } else if (firstNumber % 2 != 0 && secondNumber % 2 != 0 && fourthNumber % 2 != 0 && thirdNumber % 2 == 0) {
            System.out.println("Odd one is " + thirdNumber);
        } else if (firstNumber % 2 != 0 && thirdNumber % 2 != 0 && fourthNumber % 2 != 0 && secondNumber % 2 == 0) {
            System.out.println("Odd one is " + secondNumber);
        } else if (secondNumber % 2 != 0 && thirdNumber % 2 != 0 && fourthNumber % 2 != 0 && firstNumber % 2 == 0) {
            System.out.println("Odd one is " + firstNumber);
        }else{
            System.out.println("No Number is odd among them");
        }
    }
}
