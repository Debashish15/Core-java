// formula a+(n-1)*1;

package Operator;
import java.util.*;

public class FindNthterm {
    public static int FNT(int a,int d,int N){
        int res=a+(N-1)*d;
        return res;
    }
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
System.out.println("input 1");
int a=sc.nextInt();
System.out.println("input 2");
int d=sc.nextInt();
System.out.println("input 3");
int n=sc.nextInt();

int res=FindNthterm(a,d,n);
System.out.println();
    }
}
