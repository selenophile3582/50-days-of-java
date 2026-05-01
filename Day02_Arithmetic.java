import java.util.Scanner;

public class Day02_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.printf("The sum is %d\n", a + b);
        System.out.printf("The difference is %d\n", a - b);
        System.out.printf("The product is %d\n", a * b);

        if (b != 0) {
            System.out.printf("The division is %d\n", a / b);
        } else {
            System.out.println("Division by zero not allowed");
        }

        sc.close();
    }
}