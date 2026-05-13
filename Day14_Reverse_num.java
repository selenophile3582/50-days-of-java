
// Reverse a number using a Loop 
import java.util.Scanner;

public class Day14_Reverse_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse :");
        int num = sc.nextInt();
        System.out.printf("The reverse of %d = ", num);

        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.print(rev);
        sc.close();
    }
}
