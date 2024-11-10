import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int sum = 0;
        do{
            System.out.println("Enter a value for even sum or enter 0 to stop");
            value = scanner.nextInt();
            if(value % 2 == 0){
                sum += value;
            }
        }while (value != 0);
        System.out.println("Sum = " + sum);
    }
}
