/*Write a program that calculates the commission earned by a salesperson based on their sales amount and commission rate. Accept the sales amount form the user and calculate commission earned by sales person based on commission rate. Refer below table for different commission rates:

Sales Amount	Commission Rate %
1 to 10000	     3
10001 to 25000	8
25001 to 50000	15
50001 to 100000	25
100001 and above	35
    Sample Run 1:
    Enter Sales amount 24000
    Based on sales amount, commission eraned = 1920

    Sample Run 2:
    Enter Sales amount 300000
    Based on sales amount, commission eraned = 105000*/

import  java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales amount");
        double commision;
        int salesAmount = scanner.nextInt();
        if(salesAmount >= 1 && salesAmount <= 10000){
            commision = salesAmount * 0.03;
        } else if (salesAmount >= 10001 && salesAmount <= 25000) {
            commision = salesAmount * 0.08;
        } else if (salesAmount >= 25001 && salesAmount <= 50000) {
            commision = salesAmount * 0.15;
        } else if (salesAmount >= 50001 && salesAmount <= 100000) {
            commision = salesAmount * 0.25;
        }else {
            commision = salesAmount * .35;
        }
        System.out.println("Based on sales amount, commission earned = " + commision);
    }
}
