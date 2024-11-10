import java.util.Scanner;

public class SumBetweenTwoPointAndCountEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter stating point");
        int startingPoint = scanner.nextInt();
        System.out.println("Enter end point");
        int endPoint = scanner.nextInt();
        int sum = 0;
        int count = 0;
        do{
            if(startingPoint % 2 == 0){
                count++;
            }
            sum += startingPoint;
            startingPoint++;
        }while (startingPoint != endPoint+1);
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
    }
}
