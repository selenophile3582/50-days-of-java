// Check if a number is Armstrong number
// Example:
// 153 → 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong number)
import java.util.Scanner;

public class Day28_Armstrong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        int no_of_digits = 0;
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            no_of_digits += 1;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int Ldigit = temp % 10;
            sum += (int) Math.pow(Ldigit, no_of_digits);
            temp /= 10;
        }
        if (n == sum) {
            System.out.println("Armstrong !!");
        } else {
            System.out.println("Not a Armstrong !! ");
        }
        sc.close();
    }

}


// (int) Math.pow(Ldigit, no_of_digits);
// Math.pow() returns a double, not an int
