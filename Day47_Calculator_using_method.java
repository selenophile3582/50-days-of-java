
import java.util.Scanner;

public class Day47_Calculator_using_method {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {

        return a > b ? a - b : b - a;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by 0 not allowed .");
            return -1;
        }
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("========================\nCalculating for %d and %d \n========================\n", a, b);

            int sum = add(a, b);
            System.out.println("Sum = " + sum);

            int diff = diff(a, b);
            System.out.println("Difference = " + diff);

            int prod = product(a, b);
            System.out.println("Product = " + prod);

            int quotient = divide(a, b);
            System.out.println("Quotient = " + quotient);

            int remainder = remainder(a, b);
            System.out.println("Remainder = " + remainder);

        }
        sc.close();
    }
}
