import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
int[] array = {5,8,14,12,11,6};
        System.out.println("Unreserved array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
     for(int i =0;i<halfLength;i++){
         int temp = array[i];
         array[i] = array[maxIndex-i];
     array[maxIndex-i] = temp;
     }


    }
}