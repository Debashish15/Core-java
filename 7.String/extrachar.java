import java.util.Arrays;

public class extrachar {
    public static void main(String[] args) {
        extrachar("abcd", "abecd");
    }

    public static void extrachar(String s1, String s2) {
        char[] x = s1.toCharArray();
        char[] z = s2.toCharArray();

        Arrays.sort(x);
        Arrays.sort(z);

        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (x[i] != z[i]) {
                System.out.println(z[i]);
                break;
            }
        }
        System.out.println(z[n]);
    }
}
