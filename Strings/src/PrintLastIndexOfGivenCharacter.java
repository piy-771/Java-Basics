import java.util.Scanner;

//WAP to print the last index of givn charater in the String
public class PrintLastIndexOfGivenCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        System.out.println("Enter a character to search");
        char search = scanner.nextLine().charAt(0);
        for (int i = input.length()-1; i >= 0; i--) {
            if(search == input.charAt(i)){
                System.out.println("index = " + i);
                break;
            }
        }

        //String class provides a method indexOf(char givenChar)
    }
}
