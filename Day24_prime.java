// 24. print prime numbers from 1 to 100 

import java.util.Scanner;

public class Day24_prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting and the end point of your range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.print("The prime numbers from 1 to " + end + " are :");

        // printing numbers 
        for (int i = start; i < end + 1; i++) {
            int IsPrime = 1;
            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    IsPrime = 0;
                    break;
                }

            }
            if (IsPrime == 1) {
                System.out.print(" " + i);
            }
        }
        sc.close();

    }

}
