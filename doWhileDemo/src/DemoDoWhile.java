import java.util.Scanner;

public class DemoDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
            System.out.println("Press 1 to continue");
            System.out.println("Press 0 to exit");
            option = scanner.nextInt();
        }while (option != 0);
    }
}
