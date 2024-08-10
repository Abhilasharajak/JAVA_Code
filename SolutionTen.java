import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println(solution.hIndex(citations1)); // Output: 3

        int[] citations2 = {1, 3, 1};
        System.out.println(solution.hIndex(citations2)); // Output: 1
    }
}


