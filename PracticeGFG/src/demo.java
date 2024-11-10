public class demo {
    public static void main(String[] args) {
//        System.out.println(binary("0111100110101100"));
//        for(int i =0;i<names.length();i++){
//            if(names[i].length()<)
//        }
//    }
//    static boolean binary(String str){
//        for(int i =0;i<str.length();i++){
//            if(str.charAt(i)!=0 || str.charAt(i) != 1){
//                return false;
//            }
//            else {
//                return true;
//            }
//        }
//        return true;
//        long a = 14;
//        long b = 8;
//        long lcf = 1;
//        long gcf = 1;
//        long min = a<b?a:b;
//        //long max = a<b?b:a;
//        System.out.println(min);
//        for(int i = 2;i<=min;i++){
//
//            if(a%i == 0 && b %i == 0){
//                gcf *= i;
//            }
//        }
//        for(int j = 2;j<=min;j++){
//            if(a%j == 0 || b % j == 0){
//                lcf *= j;
//            }
//        }
//        lcf = a*b/gcf;
//        System.out.println("lcf = " + lcf);
//        System.out.println("gcf = " + gcf);

//        int n = 4;
//        int i = 1;
//        int sum = 0;
//        while (i != n){
//            for(int j =1;j<=i+1;j++){
//                if(i % j == 0){
//                    sum += j;
//                }
//            }
//            i++;
//        }
//        System.out.println("sum = " + sum);
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//
//        int jumps = 0;
//        int maxrange = arr.length;
//        int steps = arr[0];
//        int i = 0;
//        while(maxrange != 0){
//            if(steps != 0){
//                maxrange = maxrange - steps;
//                jumps++;
//                steps = arr[maxrange-1];
//
//            }else{
//                System.out.println(0);
//            }
//        }
//        System.out.println("jumps = " + jumps);
//        long sum = 0;
//        long N =5;
//       // long i = 1;
//       for(int i = 1;i<=N;i++){
//           sum += N/i*i;
//       }
//        System.out.println("sum = " + sum);;
//        int[] array = {5,4,2,6,7,1};
//        System.out.println();
//        ArrayList<Integer> list = new ArrayList<>(6);
//        int check = array[0];
//        for(int i = 1;i<6;i++){
//            if(check>=array[i]){
//                list.add(check);
//
//            }
//            check = array[i];
//        }
//        list.add(array[6-1]);
        //System.out.println(list);
       // System.out.println(leaders(6,array));


        int[] array = {-2,-3,4,-1,-2,1,5,-3};
        int max = Integer.MIN_VALUE;
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if(sum<0){
                sum = 0;
            }
            sum += array[i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("max = " + max);
    }
//    static ArrayList<Integer> leaders(int n, int arr[]) {
//        // Your code here
//        ArrayList<Integer> list = new ArrayList<>();
//        int chech = arr[0];
//        for(int i = 1;i<n;i++){
//            if(chech>=arr[i]){
//                list.set(i,chech);
//            }
//        }
//        return list;
//    }
}
