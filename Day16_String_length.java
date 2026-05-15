// 16. Take a string and print its length

import java.util.Scanner;

public class Day16_String_length {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");

        String str = sc.nextLine();
        int len_of_str = (str.length());

        System.out.println(len_of_str);
        sc.close();
    }
}
