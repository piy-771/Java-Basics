import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder("Vaibhav");
//        Scanner scanner = new Scanner(System.in);
//        int length = stringBuilder.length();
//        System.out.println(length);
//        int capacity = stringBuilder.capacity();
//        System.out.println(capacity);
//;        stringBuilder.append("Diwan");
//        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.length());
//        System.out.println(stringBuilder.capacity());
//
//        for (int i = 0; i < 15; i++) {
//            stringBuilder.append(scanner.nextLine());
//
//
//        }
        //another way of creating stringbuilder
        StringBuilder stringBuilder1 = new StringBuilder();
        //this will create  an empty StringBuilder with initial capacity of 16 character

        //wap to check and show increase in capacity of string builder by appending multiple character.Also check and show decrease in capacity
        //of string builder by using the delete char method


        StringBuilder stringBuilder2 = new StringBuilder("The quick brown fox jumps over the lazy dog");
       for(int i = 0;i<stringBuilder2.length();i++){
           System.out.print(i + " ");


       }
        System.out.println();
        for (int i = 0; i < stringBuilder2.length(); i++) {
            System.out.print(stringBuilder2.charAt(i) + " ");
            if(i>9){
                System.out.print(" ");
            }
        }


    }
}