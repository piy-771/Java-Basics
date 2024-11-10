import java.util.Scanner;

public class SumBetweenTwoPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stating point");
        int startingPoint = scanner.nextInt();
        System.out.println("Enter end point");
        int endPoint = scanner.nextInt();
        int sum = 0;
        do{
            sum += startingPoint;
            startingPoint++;
        }while (startingPoint != endPoint);
        System.out.println("sum = " + sum);
    }
}
