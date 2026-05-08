import java.util.Scanner;

public class Day09_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year ");
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 00 && year % 100 != 0 ){
            System.out.println("Leap Year ");
        }
        else {
            System.out.println("NOT a Leap Year");
        }

        sc.close();
    }
}