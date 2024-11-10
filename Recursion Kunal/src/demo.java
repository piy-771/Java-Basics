public class demo {
   // public static int  x =1;
    public static void main(String[] args) {
//        String S = "ggeks for geeks";
//        S.replaceAll("['a' , 'e','i','o','u']","");
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        int sum =1;
        if(n==0){
            return 1;
        }if(n>=1){
            sum = sum *n*(n-1);
            factorial(n-1);
        }
        return sum;
    }
}
