public class SolutionTwe {
    public static int[] printUnsorted(int[] arr) {
        int n = arr.length;
        int[] temp = {-1, -1};
    
        // Step 1: Find the first element which is out of order from the left
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp[0] = i;
                break;
            }
        }
    
        // If the array is already sorted
        if (temp[0] == -1) {
            return temp;
        }
    
        // Step 2: Find the first element which is out of order from the right
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                temp[1] = i;
                break;
            }
        }
    
        // Step 3: Find the minimum and maximum values in the unsorted subarray
        int min = arr[temp[0]], max = arr[temp[0]];
        for (int i = temp[0] + 1; i <= temp[1]; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    
        // Step 4: Extend the subarray to include any numbers which are out of order
        for (int i = 0; i < temp[0]; i++) {
            if (arr[i] > min) {
                temp[0] = i;
                break;
            }
        }
        for (int i = n - 1; i > temp[1]; i--) {
            if (arr[i] < max) {
                temp[1] = i;
                break;
            }
        }
    
        return temp;
    }
    
    
        public static void main(String[] args) {
            int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
            int[] result = new SolutionTwe().printUnsorted(arr);
            System.out.println("Indices of the unsorted subarray: " + result[0] + " to " + result[1]);
        }
        
    }
    
