import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String string = new String("HEllo Java Java");
        System.out.println(string.intern());
        System.out.println(string.charAt(4));
        System.out.println(string.substring(0,5));
        System.out.println(string.compareTo("abc"));
        System.out.println("contains method = "+string.contains("l"));
        System.out.println(string.endsWith("ava"));
        System.out.println(string.startsWith("hELLO"));
        System.out.println(string.equalsIgnoreCase("hELLO JAva"));
        System.out.println(string.indexOf("Java"));
        System.out.println(string.indexOf("Java",10));
        System.out.println(string.indexOf(69));
        System.out.println(string.startsWith("HEl"));
   if(!string.contains("k")){
       System.out.println("success");

   }
        String s = "[}()";
        if((s.contains("{") && !s.contains("}")) || (s.contains("}") && !s.contains("{"))){
            System.out.println(false);;
        }
        int[] arr = new int [214748364];
        System.out.println(arr.length);
       // System.out.println(Arrays.toString(arr));
        System.out.println(2*2);
        System.out.println(2^1);
        int x = 'a';
        System.out.println(x);
    }
}
