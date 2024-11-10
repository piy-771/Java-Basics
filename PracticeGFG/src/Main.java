public class Main {
    public static void main(String[] args) {
//        int[] v = {5,6,8,4,11,9};
//
//        //bubble sort
//        int temp =0;
//        for(int i =0;i<v.length;i++){
//            for(int j = i+1;j<v.length;j++){
//                if(v[j]<v[i]){
//                    temp=v[i];
//                    v[i]= v[j];
//                    v[j] = temp;
//                }
//            }
//
//        }
//        for(int i = 0;i<v.length;i++){
//            System.out.print(v[i] + " ");
//        }
        //      System.out.println(isDigitSumPalindrome(56));
//        int N = 9;
//        for (int i = 1; i <= 10; i++) {
//            int j = i * N;
//            System.out.print(j + " ");
//        }
//        int A = 10;
//        int B = 3;
//        int C = 2;
//        if(A>B &&A>C){
//            System.out.println(A);;
//        }else if(B>A&&B>C){
//            System.out.println(B);
//        }else{
//            System.out.println(C);
//        }
//        long[] a = {4,2,7};
//        long[] b = {5,6,3};
//        long ca =0;
//        long cb = 0;
//        for(int i =0;i<3;i++){
//            if(a[i]>b[i]){
//                ca++;
//            }else{
//                cb++;
//            }
//
//        }
//        System.out.println(ca + " " + cb);
//        List<Integer> list = new List<Integer>();
//        long N = 18486;
//        int ans  = (int)Math.pow(N,1/3);
//        System.out.println(0%2);
//        int n = 6;
//        //long[] a = new long[n];
//       long[] a = {5,12,36,4,58,36};
//
//        for(int i =0;i<n;i++){
//            for(int j = i+1;j<n;j++){
//                if(a[i]>a[j]){
//                    long temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        Pair p1 = new Pair(a[0], a[n-1]);
//        // Pair<Long, Long> p
//        //     = new Pair<Long, Long>(a[0],a[n-1]);
//        // return p;
//        System.out.println(p1.getKey() + " " + p1.getValue());
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b));
//        System.out.println(a.substring(1,a.length()-1));

//            Scanner sc = new Scanner(System.in);
//            String str = sc.next();
//            String result = "";
//
//
//            for(int i=0; i<str.length(); i++) {
//                if(str.charAt(i) == 'e') {
//                    result += 'i';
//                } else {
//                    result += str.charAt(i);
//                }
//            }
//
//
//            System.out.println(result);
//        int toInteger = Integer.valueOf();
//        System.out.println(toInteger);

//        String k = "jkdhfuge2154W";
//        String l = k.replaceAll(".","L");
//        System.out.println(k.length());
//        System.out.println(l.length());

//        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
//        String smallest = "";
//        String largest = "";
//        int k = 30;
//        smallest = s.substring(0,k);
//        largest = s.substring(0,k);
//
//        for (int i = 1; i < s.length()-(k-1); i++) {
//
//            String sub =  s.substring(i, i+k);
//            //System.out.println(sub);
//            int compareSmallest = sub.compareToIgnoreCase(smallest);
//            int compareLargest = sub.compareToIgnoreCase(largest);
//            if(compareSmallest<0){
//                smallest = sub;
//            }
//            if(compareLargest>0){
//                largest = sub;
//            }
//        }


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'-

//        System.out.println("smallest = " + smallest);
//        System.out.println("largest = " + largest);
//        String a = "CaT";
//        String b = "cAtbj";
//        char[] s =a.toLowerCase().toCharArray();
//        System.out.println(Arrays.toString(s));
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
//        a= s.toString();
//        System.out.println(a);
//        for (int i = 0; i <a.length(); i++) {
//            for (int j = 0; j < b.length(); j++) {
//                if((char)b[i]<(char)a[i])
//            }
//
//
//        }
        //System.out.println(b.toLowerCase().contains(a.toLowerCase().substring(3,4)));
//        boolean flag = false;
//        if(a.length() == b.length()){
//            for (int i = 0; i < a.length(); i++) {
//                if(b.toLowerCase().contains(a.toLowerCase().substring(i,i))){
//                    flag = true;
//                }else{
//                    flag = false;
//                }
//                    break;
//                }
//
//            }
//        System.out.println("flag = " + flag);
//        String s = "       YES      leading spaces        are valid,    problemsetters are         evillllll";
//        //String t = s.replaceAll("[',?]"," ");
//        //System.out.println(t);
//        String[] arr = s.split("[',?@!. ]+");
//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//      }
//        String s = "[AZ[a-z](a-z)";
//
//        Pattern pattern2 = Pattern.compile("[AZz)]");
//        System.out.println(pattern2.flags());

        int[] arr = {29,72,98,13,87};

//        int minIndex = 0;
//        for(int i = 0;i< arr.length;i++){
//            int min = Integer.MAX_VALUE;
//            for (int j = i; j < arr.length; j++) {
//                if(arr[j]<min){
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            System.out.println(min);
//            int temp = arr[i];
//            arr[i] = min;
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        int sorted = arr[0];
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if(arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }else{
//                    break;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        int basic = 4567; char grade = 'B';
        double da = basic * (double)50/100;
        System.out.println(da);
        double hra = basic* (double)20/100;
        System.out.println("hra = " + hra);
        double pf = basic* (double)11/100;
        System.out.println("pf = " + pf);
        int allowance = 0;
        if(grade == 'A'){
            allowance = 1700;
        }else if(grade == 'B'){
            allowance = 1500;
        }else{
            allowance = 1300;
        }
        System.out.println(Math.round(basic + hra + da +allowance - pf));
        }
}
//    public static int isDigitSumPalindrome(int N) {
//        // code here
//        int sum =0;
//        int l = N;
//        while(l!=0){
//            int digit = l%10;
//            sum += digit;
//            l = l/10;
//        }
//        if(!isPalindrome(sum)){
//            return 0;
//        }else return 1;
//    }
//    public static boolean isPalindrome(int sum){
//        int l = sum;
//        int temp = 0;
//        while(l!=0){
//            int digit = sum%10;
//            temp = temp*10+digit;
//            l = l/10;
//
//        }
//        if (sum == temp){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    class Solution {
//        public long[] findElements( long a[], long n)
//        {
//            // Your code goes here
//            for (int i = 0 ;i<n;i++){
//                for(int j = i+1;j<n;j++){
//                    if(a[i]>a[j]){
//                        long temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//                    }
//                }
//            }
//            long[] ans = new long[n-2];
//            for(int i = 0;i<n-2;i++){
//                ans[i] = a[i];
//            }
//            return ans;
//
//        }
//    }
//}