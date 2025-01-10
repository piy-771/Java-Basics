import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  age");
        int age = scanner.nextInt();
        if(age >= 0 && age <= 12){
            System.out.println("Child");
        } else if (age >= 13 && age<=19) {
            System.out.println("Teen");

        }else if (age >= 20 && age<=59) {
            System.out.println("Adult");

        }else if (age >= 60 && age<=100) {
            System.out.println("Senior");
        }else{
            System.out.println("Invalid age");
        }
    }
}
