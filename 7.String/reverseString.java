// reverse a string
public class reverseString {
    public static void main(String[] args) {
        rvrse("hello");
    }

    public static void rvrse(String s){
       String  x=" ";

        int ln=s.length()-1;
      while (ln>=0) {
        x=x+s.charAt(ln);
        ln--;
      }
      System.out.println(x);
    }
}
