package Decisionmaking;
import java.util.*;
public class switchTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("l for left , r for right , u for up , d for down");
        System.out.println("enter navigation ");
        String move=sc.nextLine();

 int x=0; int y=0;
 switch (move) {
    case "l": case "L" :
        x--;
        System.out.println(x);
        break;
 
        case "r":case "R":
        x++;
        System.out.println(x);
        break;
        
        case "u":case "U":
        y++;
        System.out.println(y);
        break;

        case "d":case "D":
        y--;
        System.out.println(y);
    break;
    default:
    System.out.println("invalid input");
        break;
 }

    }

}
