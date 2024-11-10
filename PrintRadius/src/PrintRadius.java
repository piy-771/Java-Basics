import java.util.Scanner;

public class PrintRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Circumference of a circle");
        double circumference = scanner.nextDouble();
        double radius = circumference/(2*3.14);
        System.out.println("Radius = " + radius);
    }
}
