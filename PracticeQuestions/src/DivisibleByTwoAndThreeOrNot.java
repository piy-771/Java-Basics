/*Write a program that reads an integer and prints:

"Divisible by 2 and 3" if the number is divisible by both 2 and 3,
"Divisible by 2 but not 3" if the number is divisible by 2 but not 3,
"Divisible by 3 but not 2" if the number is divisible by 3 but not 2,
"Not divisible by 2 or 3" if the number is not divisible by either.
*/

import java.util.Scanner;

public class DivisibleByTwoAndThreeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer = scanner.nextInt();
        if(integer % 2 == 0 && integer % 3 == 0){
            System.out.println("Divisible by 2 and 3");
        } else if (integer % 2 == 0 && integer % 3 != 0) {
            System.out.println("Divisible by 2 but not by 3");
        } else if (integer % 3 == 0 && integer % 2 != 0) {
            System.out.println("Divisible by 3 but not by 2");
        }else {
            System.out.println("Not divisible by 2 and 3");
        }
    }
}
