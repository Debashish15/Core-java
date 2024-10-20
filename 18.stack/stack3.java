import java.util.ArrayDeque;
import java.util.Scanner;

public class stack3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int choice;

        do{
        System.out.println("Choice an Operation");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("4. exit");
        System.out.println("5. print");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("enter element to push the item : ");
                int x = sc.nextInt();
                s.push(x);
                System.out.println(x + "Pushed into the stack");
                break;

                case 2:
                    s.pop();
                    System.out.println("Item poped into the stack");
                    break;
                
                    case 3:
                      int z= s.peek();
                        System.out.println(z + " is the peek item");
                        break;

                     case 4:
                     System.out.println("Exiting .... ");
                     break;

                     case 5:
                     System.out.println("stack conntent "+ s);
                     break;

            default:
                System.out.println("invalid input");
        }
    }
    while (choice!=4) ;
    }
}
