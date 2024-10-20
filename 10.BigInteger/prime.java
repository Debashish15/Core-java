import java.math.BigInteger;


public class prime {
    public static void main(String[] args) {

    }

}
public static BigInteger Prime(int a){
BigInteger f=new BigInteger("1");
int cnt=0;
for (int i = 2; i <= a; i++) {
    BigInteger x=BigInteger.valueOf(i);
    if (a%i==0) {
        cnt++;
    }
}

    return a;
}