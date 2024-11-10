import java.util.*;
public class parssingFunction {
    public static void main(String[] args) {
        int[] num ={8,69,4,2};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    public static void change(int[] arr){
        arr[0] =99;
    }
}
