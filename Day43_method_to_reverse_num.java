
import java.util.Scanner;

public class Day43_method_to_reverse_num {

    public static int reverse(int a) {
        int rev = 0;
        while (a > 0) {
            int lDigit = a % 10;
            rev = (rev * 10) + lDigit;
            a /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int result = reverse(a);
            System.out.println(result);
        }

    }
}
