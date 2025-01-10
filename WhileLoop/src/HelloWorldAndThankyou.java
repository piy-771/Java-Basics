import java.util.Scanner;

public class HelloWorldAndThankyou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if(number>0){
            for(int i =0;i<10;i++){
                System.out.println("Hello World");

            }

        }
        System.out.println("Thank you");

    }
}
