import java.util.Arrays;
import java.util.Scanner;

public class MaximumDumplings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input size and array
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in descending order
        Arrays.sort(numbers);
        reverseArray(numbers);

        int maxDumplings = 0;
        int total = 0;

        // Calculate maximum dumplings
        for (int i = 0; i < N; i++) {
            total = numbers[i] + total;
            maxDumplings = Math.max(maxDumplings, total);
        }

        System.out.println(maxDumplings);
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

