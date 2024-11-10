import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4,4};
        int unique = arr[0];
        arr[0] = unique;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(unique != arr[j]){
                    count++;
                    unique = arr[i];
                }
            }
            arr[i] = unique;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
