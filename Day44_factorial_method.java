
import java.util.Scanner;

public class Day44_factorial_method {

    private static int factorial(int a) {
        if (a == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int result = factorial(a);
            System.out.println(result);
        }
        sc.close();

    }
}
