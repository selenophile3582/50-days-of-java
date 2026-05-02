import java.util.Scanner;

public class Day03_Name_Printing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();

        System.out.print("Enter your age :");
        int age = sc.nextInt();
        System.out.printf("Your name is " + name + " and your age is" + age);
        sc.close();
    }
}
