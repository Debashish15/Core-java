import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("input 1");
            int a = sc.nextInt();
            System.out.println("Input 2");
            int b = sc.nextInt();
            int sum = a + b;

            System.out.println("Sum is : " + sum);
        } catch (Exception e) {
            System.out.println("error " + e.getLocalizedMessage());
        } finally {
            System.out.println("program execution done");
        }

    }
}
