import java.math.BigInteger;
public class BigintegerTONormal {
    public static void main(String[] args) {
        BigInteger A=new BigInteger("100");
        int a=A.intValue();
        System.out.println(a);
        long b=A.longValue();
        System.out.println(b);
    }
}
