//21. Find maximum element in array 

import java.util.Scanner;

public class Day21_Max_element_in_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter :");
        int size = sc.nextInt();

        int my_arr[] = new int[size];

        System.out.print("Enter your elements :");
        // Taking elements from user 
        for (int i = 0; i < size; i++) {
            my_arr[i] = sc.nextInt();
        }

        //finding largest 
        int largest = my_arr[0];
        for (int i = 0; i < my_arr.length; i++) {
            if (my_arr[i] > largest) {
                largest = my_arr[i];
            }
        }
        System.out.println("The largest number is " + largest);

        sc.close();

    }
}
