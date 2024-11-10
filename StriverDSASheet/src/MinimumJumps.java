public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20};
        int jumps = 0;
        int i = 0;
        while(arr.length-1 > i){
            if(arr[i] == 0){
                System.out.println(-1);
                break;
            }
            i += arr[i];
            jumps++;
        }
        System.out.println("jumps = " + jumps);
    }
}
