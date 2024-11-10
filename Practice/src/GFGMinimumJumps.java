public class GFGMinimumJumps {
    public static void main(String[] args) {
        int[] arr  = {9 ,10 ,1 ,2, 3, 4, 8 ,0 ,0, 0, 0, 0, 0, 0, 1};
        int i = 0;
        int count = 0;
        while(i<arr.length-1){
            if(arr[i] == 0){
                System.out.println(-1);
                break;
            }
            i += arr[i];
            count++;
        }
        System.out.println("Count = " + count);
    }
}
