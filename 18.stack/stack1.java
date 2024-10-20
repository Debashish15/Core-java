// stack is a LIFO (Last in Fast Out)

import java.util.ArrayDeque;

public class stack1{
    
    public static void main(String[] args) {
    ArrayDeque<Integer> s=new ArrayDeque<>();
    s.push(10);    
    s.push(30);    
    s.push(220);    
    s.push(890);
    
    System.out.println(s);
    
    }
}