import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(Fact(a));
    }

    public static BigInteger Fact(int a) {
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= a; i++) {
            BigInteger x = BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;
    }
}
