//wap to create an array which will represent binary digit that are 0 and 1.Each binary o avaialable on odd index and each binary 1
//will be available even index and considex 0 index is even

import java.util.Arrays;

public class ArrayProcessing5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0 ){
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
