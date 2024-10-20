import java.util.ArrayDeque;

public class stack2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);

        System.out.print("pushed element is ");
        System.out.println(s);
        System.out.print("poped element is ");
     System.out.println(s.pop());

     
    }
}
