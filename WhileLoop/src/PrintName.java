import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piyush Sahu");
        System.out.println("Enter an integer");
        int value = scanner.nextInt();
        if(value%5==0){
            System.out.println("piyush2103@gmail.com");
        }else{
            System.out.println("No contact information available");
        }
    }
}
