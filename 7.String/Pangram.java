public class Pangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        boolean result = fun(s);
        System.out.println(result ? "Pangram" : "Not a Pangram");
    }

    public static boolean fun(String s) {
        int lngth = s.length();
        if (lngth < 26) {
            return false;
        }

        boolean visited[] = new boolean[26];
        for (int i = 0; i < lngth; i++) {
            char x = s.charAt(i);
            if (x >= 'a' && x <= 'z') {
                visited[x - 'a'] = true;
            } else if (x >= 'A' && x <= 'Z') {
                visited[x - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
}
