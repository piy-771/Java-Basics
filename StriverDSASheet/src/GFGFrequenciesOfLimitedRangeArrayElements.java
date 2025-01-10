import java.util.Arrays;

public class GFGFrequenciesOfLimitedRangeArrayElements {
    public static void main(String[] args) {
        int n = 5;
        int P = 5;
        int[] arr = {2, 3, 2, 3, 5};
//        int[] ans = new int[n];
//        for(int i = 0;i<n;i++){
//            if(arr[i] <=P && arr[i] >0){
//                ans[arr[i]-1]++;
//            }
//        }

        for (int i = 0; i < n; i++) {
            if(i<=P && i>0){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
       // System.out.println(Arrays.toString(ans));
    }
}
