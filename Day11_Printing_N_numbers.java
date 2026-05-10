// Printing first N natural numbers 

import java.util.Scanner;

public class Day11_Printing_N_numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        System.out.print("The first " + n + " natural numbers are :");

        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        sc.close();
    }

}
