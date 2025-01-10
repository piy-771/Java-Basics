import java.util.Scanner;

public class ChangeLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        //String string = new String(scanner.nextLine());


        for(char ch : string.toCharArray()){
            if(Character.isLetter(ch)){
                ch = (char) (ch+1);
                System.out.println(ch);
                ans.append(ch);
            }
        }

        System.out.println(ans);

    }
}
