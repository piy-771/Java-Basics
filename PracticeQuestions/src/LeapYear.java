/*Write a program that checks if a given year is a leap year. Print "Leap Year" or "Not a Leap Year".*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ener year");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
            System.out.println("It's s leap year");
        }else {
            System.out.println("It's not a leap year");
        }
    }
}
