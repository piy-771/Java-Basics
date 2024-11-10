import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Integer
//        BigInteger A = BigInteger.valueOf(56);
//        BigInteger B = BigInteger.valueOf(56245153);
//    //    BigInteger D = A.add(B);
//    //    System.out.println(D);
//
//        //String
//        BigInteger s = new BigInteger("5543236536");
//        BigInteger k = new BigInteger("5543236536");
//
//        //Constant
//        BigInteger c = BigInteger.ONE;
//    //    System.out.println(c);
//
//
//        //multiply
//        BigInteger g = s.multiply(k);
//        System.out.println(g);
//
//        //add of int to string
//        BigInteger D = A.add(s);
//            System.out.println(D);
//
//        ArrayList<Integer> list=new ArrayList<Integer>(2);
//        int n =6;
//        int[] arr = {4,5,2,6,8,12};
//        int s = 13;
//        System.out.println(arr[1]);
//
//        int [] ans;
//        int sum;
//        for(int i =0;i<n;i++){
//            sum =0;
//            for(int j = i;j<n;j++){
//
//                sum += arr[j];
//                if(sum==s){
//                    list.add(i+1);
//                    list.add(j+1);
//                    break;
//
//                }
//            }
//        }
//        System.out.println(list);
//        int n = 9;
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//
//        int sub=0;
//        int sum =0;
//        for(int i =0;i<n;i++){
//            sum +=arr[i];
//        }
//        for(int i =0;i<n;i++){
//            for(int j =i;j<n;j++){
//                if(arr[i]<sum){
//                    break;
//                }
//                sub+=arr[j];
//                if(sub>sum){
//                    sum = sub;
//                }
//
//            }
//        }
//
//        System.out.println(sum);
//        int n =7;
//        int[] a ={0,1,2,1,0,0,2};
//
//            for(int j =0;j<n-1;j++){
//                if(a[j]>a[j+1]){
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//
//        }
//        for(int i =0;i<n;i++){
//            System.out.print(a[i] + " ");
//
//        }
//        long n =18468;
//        long sum =0;
//        for(long i =1;i<=n;i++){
//            sum += i*i*i;
//        }
//        System.out.println(sum) ;
//        int num = 1003;
//        int ans =0;
//        int rev =0;
//
//        while(num!=0){
//            int r = num%10;
//            if(r==0){
//                r=5;
//            }
//            rev = rev*10+r;
//            num = num/10;
//
//        }
//        //System.out.println(rev);
//        while(rev!=0){
//            int r = rev%10;
//
//            ans = ans*10+r;
//            rev = rev/10;
//
//        }
//        System.out.println(ans);
//        int n =5;
//        int c =0;
//        int[] arr = {56,3,65,14,89};
//        for(int i =0;i<n;i++){
//            for(int j =0;j<n;j++){
//                if(arr[i]==arr[j]){
//
//                    c++;
//                }
//
//            }
//            if(c%2 != 0){
//                System.out.println(arr[i-1]);
//            }
//        }
//        int n =7;
//        int[] a = {1,2,3,2,3,1,3};
//        Arrays.sort(a);
//        for(int i =0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//        for(int i =0;i<n-1;i++){
//            int c =1;
//            if(a[i] == a[i+1]){
//                c++;
//            }
//            if(c%2 == 0){
//                continue;
//            }else {
//                System.out.println(a[i]);
//            }
//        }
//        int n =37;
//         int[] arr = {61 ,30, 28, 47, 42, 25, 41, 56, 27, 45, 44, 34, 46, 35, 58, 36, 60, 29, 53, 55, 32, 31, 33, 59, 50, 51 ,52, 37, 39, 38, 43 ,49, 54, 57, 40, 26 ,48};
//        int lar1 = Integer.MIN_VALUE;
//        int lar2 = lar1;
//        for(int i =0;i<n;i++){
//            if(arr[i]>lar1){
//                lar2 = lar1;
//                lar1 = arr[i];
//            }
//            if(lar2<arr[i] && lar1>arr[i]){
//                lar2 = arr[i];
//            }
//
//
//            // }
//
//        }
//
//        System.out.println(lar2);
//        int x =-121;
//        int rev =0;
//        int t =x;
//        while(t!=0){
//            int r = t%10;
//            rev = rev*10+r;
//            t = t/10;
//        }
//        System.out.println(rev);

        int N =15 ;

        boolean flag = true;
        for(int i = N-1;i>=2;i--){
            if(N%i != 0){
                flag = false;
                break;
            }

        }
        if(flag == false){
            System.out.println(1);;
        }else{
            System.out.println(0 );;
        }



    }
}