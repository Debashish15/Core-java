public class Super {
    public static void main(String[] args) {
        B obj = new B();
        obj.child(12, 10);
    }
}

class A {

    int Parent(int x) {
        x = 10;
        return x;
    }
}

class B extends A {
    int child(int x,int y){
       x= super(x);
        return x+y;
    }
}
