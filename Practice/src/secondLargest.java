public class secondLargest {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int[] arr = {4,56,78,14,-56,10,0};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i]) {
                secondMax = arr[i];

            }
        }
        System.out.println("Second largest number = "+secondMax);
    }
}
