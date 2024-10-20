public class prime {
    public static void main(String[] args) {
        int a=12;

        int cnt=0;
        for (int i = 2; i <= a; i++) {
            if (a%i==0) {
                cnt++;
            }
        }
        if (cnt==1) {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
