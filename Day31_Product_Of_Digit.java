// Find product of digits of a number

import java.util.Scanner;

public class Day31_Product_Of_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int product = 1;

        while (n > 0) {
            product = product * (n % 10);
            n /= 10;
        }
        System.out.println("The product of digits of the number is : " + product);
        sc.close();
    }
}
