import java.util.Scanner;
//Program to convert binary to decimal number
public class test {
    public static void main(String[] args) {
        //program to convert binary to decimal
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number = ");
        int a = sc.nextInt();
        double sum =0;
        int i =0;
        while(a>0){
            double b = (a%10)*Math.pow(2,i);
            sum +=b;
            a = a/10;
            i++;
        }
        System.out.println(sum);

    }
}
