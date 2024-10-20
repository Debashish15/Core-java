import java.util.*;

public class intro {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        try{
            System.out.println("input 1");
           int x=sc.nextInt();
           System.out.println("Input 2");
           int y=sc.nextInt();
         
           System.out.println(x+y);
        }
        catch(Exception e ){
  System.out.println("error messager "+e.getMessage());
        }
        finally{
            System.out.println("final exception called");
        }
    }
}
