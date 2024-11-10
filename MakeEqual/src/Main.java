import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //wap to accept three no. from user check two no. are equal then make third no. equal to first two otherwise print invalid number
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = scanner1.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner1.nextInt();
        System.out.println("Enter third number");
        int number3 = scanner1.nextInt();
        int difference;
        if(number1 == number2 && number3 != number1){
            if(number3<number1){
                difference = number1-number3;
                number3 += difference;
            }else{
                difference = number3-number1;
                number3 -= difference;

            }
            System.out.println("Number 1 = " + number1);
            System.out.println("Number 2 = " + number2);
            System.out.println("Number 3 = " + number3);
        } else if (number1 == number3 && number1 != number2) {
            if(number2<number1){
                difference = number1-number2;
                number2 += difference;
            }else{
                difference = number2-number1;
                number2 -= difference;

            }
            System.out.println("Number 1 = " + number1);
            System.out.println("Number 2 = " + number2);
            System.out.println("Number 3 = " + number3);

        } else if (number2 == number3 && number2 != number1) {
            if(number1<number2){
                difference = number2-number1;
                number1 += difference;
            }else{
                difference = number1-number2;
                number1 -= difference;
            }
            System.out.println("Number 1 = " + number1);
            System.out.println("Number 2 = " + number2);
            System.out.println("Number 3 = " + number3);
        }else{
            System.out.println("Invalid Input");
        }


    }
}