public class Encapsulation {
    public static void main(String[] args) {
        test obj=new test();
    
        System.out.println(obj.get1());
        System.out.println(obj.get2());
        System.out.println(+obj.get3());
   
   
   System.out.println("Sum is "+obj.sum());
   
    }
}

class test{
    private int a=10;
    private int b=20;
    private int c=30;

    int get1(){
        return a;
    }
    int get2(){
        return b;
    }

    int get3(){
        return c;
    }

    int sum(){
        return a+b+c;
    }
}
