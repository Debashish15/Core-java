// compile time polymorphism - method Overloading
public class Polymorphism2 {
    public static void main(String[] args) {
        A obj = new A();
      System.out.println(obj.call(10));
    }
}

class A {
    int call(int x) {
        return x;
    }

    int call(int x, int y) {
        return x + y;
    }

    int call(int x, int y, int z) {
        return x + y + z;
    }
}