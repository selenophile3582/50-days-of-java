// 55. Left rotate array by 1 position

import java.util.Scanner;

public class Day37_LeftRotateArray {

    static void leftRotate(int arr[]) {
        int temp = arr[0];
        int end = arr.length;

        for (int i = 1; i < end; i++) {
            arr[i - 1] = arr[i];
        }
        arr[end - 1] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter your elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        leftRotate(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
