import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] firstArray = {5,6,2,53,1};
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.println(Arrays.toString(secondArray));

    }
}
