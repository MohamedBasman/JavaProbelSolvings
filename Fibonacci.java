import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int a = 0, b = 1, sum = 0;
        
        if (n < 0) {
            System.out.println("Invalid input, please enter a non-negative number.");
        } else if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(a + ", " + b);
        } else {
            System.out.print(a + ", " + b);
            for (int i = 2; i < n; i++) {
                sum = a + b;
                a = b;
                b = sum;
                System.out.print(", " + sum);
            }
            System.out.println();
        }
        s.close();
    }
}
