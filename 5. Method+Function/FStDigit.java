package Method;

public class FStDigit {
    public static void main(String[] args) {
        System.out.println(digit(9768));
    }
    public static int digit(int x){
        while (x>10) { // 10 is for need single digit , if we need two digit no then we will set (x>100).
            x=x/10;
        }
        return x;
    }
}
