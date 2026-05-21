// 22. Find sum of array elements 

import java.util.Scanner;

public class Day22_Sum_of_array_elements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want to eneter : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter your elements :");
        //Taking elements 
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        //finding the sum of elements 
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        System.out.print("The sum of all elements entered is : " + sum);
        sc.close();
    }
}
