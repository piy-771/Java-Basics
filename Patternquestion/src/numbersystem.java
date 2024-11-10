import java.util.Scanner;

public class numbersystem {
    public static void main(String[] args) {
        //program to convert decimal to binary
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number = ");
        int a = sc.nextInt();
        while (a>0){
            int r = a%2;
            s += r;
            a =a/2;
        }
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(s);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
