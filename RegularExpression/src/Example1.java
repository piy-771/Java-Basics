
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static  void isRegex(String re,String str){
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
    public static void main(String[] args) {

        while (true){
            System.out.println("Enter a regular Expression");
            Scanner scanner = new Scanner(System.in);
            String re = scanner.nextLine();
            System.out.println("Enter a String");
            String str = scanner.nextLine();
            isRegex(re, str);
            System.out.println("Press Y to exit ");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                break;
            }

        }

    }
}
