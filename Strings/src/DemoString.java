import java.util.Scanner;

public class DemoString {
    public static void main(String[] args) {
        //string.charAt(index)
        //
        //write a prgram to check given character present in given string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        System.out.println("Enter a character to search");
        char search = scanner.nextLine().charAt(0);
        String name = new String("Java ka Baba");

         boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == search){

                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }




    }
}
