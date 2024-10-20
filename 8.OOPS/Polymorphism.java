//  Run Time PoLymorphism - Overriding
public class Polymorphism {
    public static void main(String[] args) {
        B obj=new B();
        obj.call();
    }
}

class A{
void call(){
    System.out.println("Call A");
}
}

class B extends A{
void call(){
    System.out.println("Call B");
}
}