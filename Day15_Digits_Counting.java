// Counting Digits of a number 

import java.util.Scanner;

public class Day15_Digits_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int no_of_digits = 0;
        System.out.printf("Number of digits in %d is ", n);

        while (n > 0) {
            no_of_digits += 1;
            n /= 10;
        }
        System.out.print(no_of_digits);
        sc.close();
    }
}
