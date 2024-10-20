import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        angrm("silent", "ilestn");
    }

    public static void angrm(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
