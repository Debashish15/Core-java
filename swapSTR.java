public class swapSTR {
    
    public static String swap(String a, String b){
        System.out.println("Before swapping" + a + " " + b);
        String temp=a;
        a=b;b=temp;
        System.out.println("After swapping " + a + " " + b);
        return temp;
    }
    public static void main(String[] args) {
        
        String a="Hello";
        String b="World!";

        swap(a, b);
    }
}
