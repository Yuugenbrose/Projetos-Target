import java.util.Scanner;

public class FibonacciSequence{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Number to fibonacci sequence: ");
        int number = scanner.nextInt();
        
        boolean belongTo = fibonacciVerify(number);
        
        if (belongTo) {
            System.out.println("\nThe number belongs to fibonacci sequence.");
        } else {
            System.out.println("\nThe number don't belongs to fibonacci sequence.");
        }
        
        scanner.close();
    }
    
    public static boolean fibonacciVerify(int number) {
        int a = 0;
        int b = 1;
        
        while (a <= number) {
            if (a == number) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}
