import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bt = new BigInteger("46212");
        BigInteger bt2 = new BigInteger("1452");
        //System.out.println(bt.add(bt2));
        BigInteger bt3 = new BigInteger("14");
        System.out.println(bt3.isProbablePrime(1));
    }
}
