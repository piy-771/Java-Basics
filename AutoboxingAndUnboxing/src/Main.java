//import java.util.*;
//import java.util.Collections;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    //    System.out.println("Hello world!");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
for(int i =0;i<=10;i++){
    list1.add(Integer.valueOf(i));
}

       // }
        for(int i =0;i<=10;i++){
            System.out.println(i + " --> "  + list1.get(i).intValue());
        }
        ArrayList<Double> list2 = new ArrayList<>();
        for(double dbl = 0.0;dbl <= 10.0;dbl += 0.5){
            list2.add(Double.valueOf(dbl));
        }
        for(int i = 0;i<list2.size();i++){
            double value = list2.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}