import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int reverseNumber = 0;
        while (number != 0){
            int lastDigit = number%10;
            reverseNumber = (reverseNumber*10)+lastDigit;
            number = number/10;
        }
        System.out.println("reverseNumber = " + reverseNumber);
    }
}
