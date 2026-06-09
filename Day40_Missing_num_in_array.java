
public class Day40_Missing_num_in_array {

    public static int findMissing(int arr[]) {
        int xor1 = 0, xor2 = 0;
        int n = arr.length;
        for (int i = 0; i < n + 2; i++) {
            xor1 ^= i;
        }
        for (int i : arr) {
            xor2 ^= i;
        }
        return xor1 ^ xor2;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 10, 8, 12, };
        int missingNum = findMissing(arr);
        System.out.println(missingNum);
    }
}
