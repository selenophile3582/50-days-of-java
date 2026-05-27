// Day 27 : write a program to find the LCM of 2 numbers  

import java.util.Scanner;

public class Day27_LCM {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers to find their LCM : ");
        int b = sc.nextInt();
        int a = sc.nextInt();
        int lcm = a * b;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;

        }
        if (a == 0 || b == 0) {
            System.out.println("The LCM of 0 and 0 is 0 ");
        } else {

            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;

            }

            lcm = lcm / a;

        }

        System.out.println(lcm);

        sc.close();

    }

}
