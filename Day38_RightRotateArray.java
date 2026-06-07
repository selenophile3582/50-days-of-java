// 56. Right rotate array by K positions

import java.util.Arrays;
import java.util.Scanner;

public class Day38_RightRotateArray {

    static void rightRotate(int arr[], int k) {

        int end = arr.length;
        k %= end;       //reducing no. of rotation if rotaion > arr.length 
        int temp[] = new int[k];

        // inserting in temporary array from origioanal array 
        for (int i = end - k; i < end; i++) {
            temp[i - (end - k)] = arr[i];
        }

        //rotating array by k position
        for (int i = end - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // arr[end - 1] = temp;
        //putting extra elelments back 
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

    }

    static void reverseArray(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    static void rotateArrayUsingReverse(int arr[], int k) {
        int end = arr.length;
        if (end == 0) {
            return;
        }
        k %= end;
        reverseArray(arr, 0, end - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, end - 1);

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

        System.out.println("How many positions do you want to rotate: ");
        int pos = sc.nextInt();

        // int copy[] = new int[size];
        // System.arraycopy(arr, 0, copy, 0, size);
        int[] copy = arr.clone();

        rightRotate(arr, pos);
        System.out.println(Arrays.toString(arr));

        rotateArrayUsingReverse(copy, pos);
        System.out.println(Arrays.toString(copy));

        sc.close();
    }
}
