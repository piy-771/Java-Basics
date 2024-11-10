/*Write a program that print the current balance of the account, ask the user to enter the withdrawal amount.

if withdrawal amount is less than current balance,
deduct the withdrawal amount form the current balance, if current balance after deduction is less than 500 INR, deduct penalty of 50 INR and print current balance and penalty.
otherwise, print the current balance.
If withdrawal amount is greater than current balance, print insufficient funds.*/

import java.util.Scanner;

public class PrintCurrentBalance {
    public static void main(String[] args) {
        int currentBalance = 5000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount");
        int withdrawalAmount = scanner.nextInt();
        if(withdrawalAmount < currentBalance){
            currentBalance -= withdrawalAmount;
            if(currentBalance < 500) {
                currentBalance -= 50;
                System.out.println("CurrentBalance = " + currentBalance);
                System.out.println("Penalty = " + 50);
            }else {
                System.out.println("CurrentBalance = " + currentBalance);
            }
        }else {
            System.out.println("Insufficient Funds");
        }
    }
}
