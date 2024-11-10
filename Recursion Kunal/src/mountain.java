import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mountain {
    public static void main(String[] args) {
//        List<Integer> ar = new ArrayList<Integer>();
//        ar.add(56);
//        ar.add(6);
//        ar.add(8);
//        ar.add(2);
//        System.out.println(ar.get(1));
//        int sum =0;
//        for(int i =0;i<ar.size();i++){
//            sum += ar.get(i);
//        }
//        System.out.println(sum);
        // int[] a = new int[9];
        int hs = 0;
        int ls =0;
         int[] a  = {10,5,20,20,4,5,2,25,1};

         for(int i =0;i<9;i++){
             for(int j =i+1;j<a.length;j++){
                 if(a[j]>a[i]){
                     hs++;
                 }else {
                     ls++;
                 }
             }
             break;
         }
        System.out.println(hs + " " + ls);
         long  hj = 95454;
        System.out.println();
    }
}
