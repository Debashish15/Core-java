package test;
public class test {
    public static void main(String[] args) {
        testing obj=new testing(10, 20);
    }
}
class testing{
    int x;int y;
    testing(int a,int b){
        this.x=a;
        this.y=b;
        int sum=a+b;
        System.out.println(sum);
    }
}
