import java.util.Scanner;

public class Day05_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.print("The given number is even number . ");
        }
        else {

            System.out.print("The given number is odd number . ");
        }
        sc.close();

    }
}