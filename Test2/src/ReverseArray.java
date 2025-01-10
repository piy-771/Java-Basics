import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int midIndex = array.length/2;
        for (int i = 0; i < midIndex; i++) {
            int temp = array[i];
            array[i] = array[array.length-(i+1)];
            array[array.length-(i+1)] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
