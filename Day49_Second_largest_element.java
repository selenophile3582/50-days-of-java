
import java.util.Scanner;

public class Day49_Second_largest_element {

    public static void secondLargest(int arr[]) {
        if(arr.length == 0 || arr.length == 1){
            System.out.println("No second largest element found");
            return ;
        }
        int secLarge = Integer.MIN_VALUE;
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secLarge = largest;
                largest = arr[i];
            } else if (largest > arr[i] && arr[i] > secLarge) {
                secLarge = arr[i];
            }
        }
        System.out.println("Second Largest : "+secLarge);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        secondLargest(arr);
        

        sc.close();
    }
}
