import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the count of array = ");
        int count= sc.nextInt();
//        readInteger(count);
        int[] array = readInteger(count);
        System.out.println(findMin(array));

    }
    public static int[] readInteger(int n){
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            System.out.println("Enter a number :");
            int number = sc.nextInt();
            sc.nextLine();
            arr[i] = number;
        }
        return arr;
    }

    public static int findMin(int[] array){
        int min = array[0];                          //another approch
        for(int i =0;i<array.length;i++){             //  int min = Integer.MAX_VALUE;
            if(min>array[i]){                         // for(int i =0;i<array.length;i++){
                min = array[i];                        //int[] value  = array[i];
            }                                          //if(value<min){
        }                                               //    min = value;
        return min;                                      // }
    }
}