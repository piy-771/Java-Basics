/*Create a program that reads the current hour (0-23) and prints:

"Good Morning" for hours between 5 and 11,
"Good Afternoon" for hours between 12 and 17,
"Good Evening" for hours between 18 and 21,
"Good Night" for hours between 22 and 4.*/

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current hour (0-23)");
        int currentHour = scanner.nextInt();
        if((currentHour >= 0 && currentHour <= 4) || currentHour>=22){
            System.out.println("Good Night");
        } else if (currentHour >= 5 && currentHour <= 11) {
            System.out.println("Good Morning");
        } else if (currentHour >= 12 && currentHour <= 17) {
            System.out.println("Good Afternoon1");
        }else if (currentHour >= 18 && currentHour <= 21){
            System.out.println("Good Evening");
        }
    }
}
