import java.util.Scanner;

public class Day07_Largest_among_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number :");
        int a = sc.nextInt();

        System.out.print("Enter Second Number :");
        int b = sc.nextInt();

        System.out.print("Enter Third Number :");
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.print("All three numbers are equal !");
        } else if (a >= b && a >= c) {
            System.out.print(a + " is the largest number . ");
        }else if ( b >= a && b >= c ){
            System.out.print(b + " is the largest number . ");
        }
        else {
            System.out.print(c+" is the largest number . ");
        }

        sc.close();
    }
}
