import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        String[] ans = str.split(" ");
        for (int i = 0; i < ans.length/2; i++) {
            String temp = ans[i];
            ans[i] = ans[ans.length-(i+1)];
            ans[ans.length-(i+1)] = temp;
        }
        System.out.println(Arrays.toString(ans));
        

        System.out.println(str);
        //String ans = new StringBuilder(str).reverse().toString();

        System.out.println(Arrays.toString(ans));
    }
}
