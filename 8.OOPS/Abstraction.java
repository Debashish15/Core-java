
public class Abstraction {
    public static void main(String[] args) {
        pig obj=new pig();
        obj.animalSound();
        obj.sleep();
    }
}
abstract class Animal{


    void animalSound(){
 
    }
void sleep(){
    System.out.println("zzz");
}
}

class pig extends Animal{
    void animalSound(){
System.out.println("wee wee");
    }
}
