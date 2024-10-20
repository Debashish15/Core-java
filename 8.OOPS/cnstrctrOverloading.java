public class cnstrctrOverloading {
    public static void main(String[] args) {
        overloading obj=new overloading(10,20);
       

    }
}

class overloading{
    int x,y,z;
    overloading(int a){
    this.x=a;
    System.out.println(a);
    }
   overloading(int b,int c){
        this.y=b;this.z=c;
       System.out.println(b+c);
    }
}