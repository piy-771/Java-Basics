import java.util.*;
public class Main {
    public static void main(String[] args) {
//        pattern1(5);
//        System.out.println();
//
//       pattern2(4);
//        System.out.println();
//
 //      pattern5(5);
//        System.out.println();

//        pattern4(5);
        pattern28(5);

    }public static void pattern1(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=(n-row)+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int row =1;row<=2*n;row++){
            int totaocol = row>n?2*n-row:row;
            for(int col=1;col<=totaocol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for(int row =1;row<=2*n;row++){
            int totaocolinrrow = row>n?2*n-row:row;

            int noOfSpaces = n-totaocolinrrow;
            for(int s =1;s<=noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=totaocolinrrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}