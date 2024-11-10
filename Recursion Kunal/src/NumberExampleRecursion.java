public class NumberExampleRecursion {
    public static void main(String[] args) {
      //  print(1);
        int N = 5;
        int[] A = {1, 2, 3, 4, 5};
        String ans = "";
        int sum =0;
        for(int i =0;i<N;i++){
            sum += A[i];
        }
        String s=Integer.toString(sum);
        ans += s;
        double avg = (double) sum/N;
        String str = Double.toString(avg);
        ans = ans + " " + str;

        System.out.println(ans);

    }
//    static void print(int n){
//        if(n == 5){
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);


        //recursive call
        //if you call a function again and again , it is treat as separate function

       //This is called tail recursion
        //this is last function to call

    //    print(n+1);                    //1-->1+1=2--->2+1=3-->3+1=4-->4+1=5

}
