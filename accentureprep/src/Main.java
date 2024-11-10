import java.util.*;

import java.util.ArrayList;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
//        int[] array = {25,4,4,25,9,9};
//        List<Integer> a = {25,4,4,25,9,9};
//        System.out.println(deviation(a));
//    }
//    public static double standardDeviation(List<Integer> arr) {
//        int N = arr.size();
//        double average = 0;
//// Calculate average
//        for (int i = 0; i < N; ++i) {
//            average += arr.get(i);
//        }
//        average /= N;
//// Calculate sum of squared differences
//        double sumOfSquares = 0;
//        for (int i = 0; i < N; ++i) {
//            sumOfSquares += Math.pow(arr.get(i) - average, 2);
//        }
//// Calculate standard deviation
//        double variance = sumOfSquares / N;
//        return Math.sqrt(variance);

        //System.out.println(pramid(4));

        ArrayList<Integer> arraylist = new ArrayList<>(5);

        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        int k = 2;
        for (int i = 0; i < arraylist.size()-1; i++) {
            int temp = arraylist.get(i);
            arraylist.set(i, arraylist.get(k+i));
            arraylist.add(temp);
        }
        
//        for (int i = 0; i < arraylist.size()-k; i++) {
//            arraylist.set(i, arraylist.get(k+i));
//        }

        System.out.println("arraylist = " + arraylist);

    }
//    public static int pramid(int n){
//        int a =0;
//        int level =0;
//        while(level<=n){
//            a += level*3;
//            level++;
//        }
//        a -= n;
//        return a;
//    }

}