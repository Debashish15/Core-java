public class generics1 {
    public static void main(String[] args) {
    pair<Integer,String> p=new pair();
    p.x=12;
    p.z="GFG";
    // String str=(String)p.x;
    
    System.out.println(p.x+" "+p.z);
    }
}
class pair<T , S>{
T x;
S z;
}
