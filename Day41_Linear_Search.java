
import java.util.Scanner;

public class Day41_Linear_Search {

    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search : ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);

        if (index == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("The element is present at index : " + index );
        }

        sc.close();

    }
}
