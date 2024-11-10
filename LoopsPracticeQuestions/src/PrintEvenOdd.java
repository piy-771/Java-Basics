import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Enter a value to know ever or odd or enter 0 to stop");
            value = scanner.nextInt();
            if(value%2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("0dd");
            }
        }while (value != 0);
    }
}
