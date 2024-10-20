import java.util.*;
import java.math.BigInteger;

public class Opearation {
    public static void main(String[] args) {
        int a = 10;
        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(a);
        BigInteger C = A.add(B); // Addition
        System.out.println("Sum : " + C);

        BigInteger D = A.multiply(B); // multiply
        System.out.println("Multiply : " + D);

        BigInteger E = A.divide(B); // Divide
        System.out.println("Divide :" + E);

        BigInteger F = A.subtract(B); // Subtract
        System.out.println("Subtract : " + F);

        BigInteger G = A.remainder(B); // Reminder
        System.out.println("Reminder " + G);

    }
}
