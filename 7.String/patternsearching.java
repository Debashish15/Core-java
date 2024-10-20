public class patternsearching {
    public static void main(String[] args) {
        pattern("geeks for geeks", "geeks");
    }

    public static void pattern(String txt, String patt) {
        int pos = txt.indexOf(patt);
        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(patt, pos + 1);
        }

    }
}
