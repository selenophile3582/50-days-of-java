// 23. Count even and odd numbers in array  

import java.util.Scanner;

public class Day23_Count_even_odd_inArray {

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
        int odd = 0;
        int even = 0;

        //finding the sum of elements 
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("even : %d , odd : %d  ", even, odd);
        sc.close();
    }
}
