// Find sum of digits of a number

import java.util.Scanner;

public class Day30_Sum_Of_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println("The sum of digits of the number is : " + sum);
        sc.close();
    }
}
