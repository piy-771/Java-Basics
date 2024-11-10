/*Write a program to accept the annual income from the user and calculate tax based of the below conditions:

In each case provide standard deduction of 50,000 INR, calculate taxable income by subtracting 50,000 form annual income.
if the taxable income is:
less than equal to 3,00,000 INR tax rate will be 0%.
greater than 3,00,000 INR and less than or equal to 5,00,000 INR tax rate will be 5%.
greater than 5,00,000 INR and less than or equal to 10,00,000 INR tax rate will be 15%.
greater than 10,00,000 INR and less than or equal to 15,00,000 INR tax rate will be 20%.
greater than 15,00,000 INR and less than or equal to 25,00,000 INR tax rate will be 25%.
greater than 25,00,000 INR tax rate will be 30%.
On the basis of the condition calculate tax amount and print.
*/

import java.util.Scanner;

public class PrintTaxAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter annual income");
        double annualIncome = scanner.nextInt();
        double taxableIncome = annualIncome - 50000;
        double tax;
        if(taxableIncome <= 300000){
             tax = taxableIncome * 0;
            System.out.println("Tax = " + tax);
        } else if (taxableIncome > 300000 && taxableIncome <= 500000) {
            tax = taxableIncome * 0.05;
            System.out.println("Tax = " + tax);
        } else if (taxableIncome > 500000 && taxableIncome<=1000000) {
            tax = taxableIncome * 0.15;
            System.out.println("Tax = " + tax);
        } else if (taxableIncome > 1000000 && taxableIncome <= 1500000) {
            tax = taxableIncome * 0.2;
            System.out.println("Tax = " + tax);
        } else if (taxableIncome > 1500000 && taxableIncome <= 2500000) {
            tax = taxableIncome * 0.25;
            System.out.println("Tax = " + tax);
        }else{
            tax = taxableIncome * 0.3;
            System.out.println("Tax = " + tax);
        }

    }
}
