package Method;

public class FStDigit2 {
    public static void main(String[] args) {
        System.out.println(digit(9768));
    }
    public static int digit(int x){
    int z=(int) Math.log10(x);
        return z;
    }
}


