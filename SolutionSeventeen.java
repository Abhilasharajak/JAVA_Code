import java.util.Arrays;

public class SolutionSeventeen {
    public static int missingNumber(int arr[], int size) {
        // Your code here
        /*
         * Input:
         * N = 5
         * arr[] = {1,2,3,4,5}
         * Output: 6
         * Explanation: Smallest positive missing
         * number is 6.
         */
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == ans && arr[i] >= 1) {
                ans++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int ans = missingNumber(arr, arr.length);
        System.out.println(ans);
    }
}
