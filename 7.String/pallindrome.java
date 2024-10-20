public class pallindrome {
    public static void main(String[] args) {
        pall("dfhj");
    }

    public static void pall(String s) {
        String q = "";
        int ln = s.length() - 1; 

        while (ln >= 0) {
            q = q + s.charAt(ln);
            ln--;
        }

        if (s.equals(q)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
