import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the percentage of student");
        int percentage = scanner.nextInt();
        if(percentage>=90 && percentage<=100){
            System.out.println("Student got A+ grade");
        } else if (percentage >= 80) {
            System.out.println("Student got A grade");
        }else if (percentage >= 70) {
            System.out.println("Student got B grade");
        }else if (percentage >= 60) {
            System.out.println("Student got C grade");
        }else if (percentage >= 50) {
            System.out.println("Student got D grade");
        }else {
            System.out.println("Student is fail");
        }
    }
}
