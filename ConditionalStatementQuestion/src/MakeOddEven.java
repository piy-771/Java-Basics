//Write a program to accept an integer from user. If the number is even make it odd and print. If the number is odd make it even and print.

import java.util.Scanner;

public class MakeOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer = scanner.nextInt();
        if(integer%2 == 0){
            integer += 1;
            System.out.println("Number = " + integer);
        }else{
            integer -= 1;
            System.out.println("Number = " + integer);
        }
    }
}
