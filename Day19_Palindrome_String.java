// Check if a string is Palindrome or not 

import java.util.Scanner;

public class Day19_Palindrome_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word :");
        String word = sc.next();
        int n = word.length();

        char[] rev = word.toCharArray();

        for (int i = 0; i < n / 2; i++) {
            
            char temp = rev[i];
            rev[i] = rev[n - i - 1];
            rev[n - i - 1] = temp;
        }

        String result = new String(rev); // converting back to string

        if (word.equalsIgnoreCase(result)) {
            System.out.println("Palindrome !");
        } else {
            System.out.print("Not a Palindrome .");
        }

        sc.close();

    }
}

// if (word == result)
// == → compares reference (memory location)
// .equals() → compares actual string content
