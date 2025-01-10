//WAP to count the occurrence of given character in the string

import java.util.Scanner;

public class CountOccurrenceOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        System.out.println("Enter a character to search");
        char search = scanner.nextLine().charAt(0);

    int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(search == input.charAt(i)){
                count++;
            }
        }
        System.out.println("count = " + count);


    }
}
