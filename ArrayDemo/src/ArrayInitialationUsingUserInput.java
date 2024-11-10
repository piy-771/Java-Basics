import java.util.Scanner;

public class ArrayInitialationUsingUserInput {
    public static void main(String[] args) {
        int size = 5;
        int[] marks = new int[size];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < marks.length; i++){
            System.out.println("Enter Marks");
            marks[i] = scanner.nextInt();
        }

        //printing array
        for(int i = 0;i < marks.length;i++){
            System.out.print(marks[i] + ", ");
        }

        //
        //wap to count and sum all the even element from the given array
        //arr = [1,2,3,4,5]


    }
}
