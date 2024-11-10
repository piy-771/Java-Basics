import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = 7;
        int userInput;
        do{
            System.out.println("Enter magic number");
            userInput = scanner.nextInt();
            if(userInput == magicNumber){
                System.out.println("Winner");
            }
        }while (userInput != magicNumber);

    }
}
