
import java.util.Scanner;

public class Day36_Reverse_Array {

    static void reverseArray(int arr[]) {
        int i = 0;
        int end = arr.length - 1;
        while (i < end) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            i++;
            end--;

        }

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
        reverseArray(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
