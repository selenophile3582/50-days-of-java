import java.util.Scanner;

public class Day08_pos_neg_zero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.print("Positive number .");
        else if (n < 0 )
            System.out.print("Negative number ");
        else 
            System.out.print("The number is zero ");

        sc.close();

    }
}
