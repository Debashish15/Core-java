public class cntDgt {
    public static void main(String[] args) {
        int n=245;
        int cnt=0;
        while (n!=0) {
            int mod=n%10;
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
    }
}
