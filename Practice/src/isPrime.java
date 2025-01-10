public class isPrime {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for(int i = n-1;i>1;i--){
            if(n%i==0){
                count++;
                if(count != 0){
                    break;
                }
            }
        }
        if(count != 0){
            System.out.println("Number is not a prime");
        }else{
            System.out.println("It is a prime number");
        }
    }
}
