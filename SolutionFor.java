public class SolutionFor {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int maxArea = 0;
    
            while (left < right) {
                int width = right - left;
                int currentHeight = Math.min(height[left], height[right]);
                int currentArea = width * currentHeight;
                maxArea = Math.max(maxArea, currentArea);
    
                // Move the pointer pointing to the shorter line
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
    
            return maxArea;
        }
    
        public static void main(String[] args) {
            SolutionFor sol = new SolutionFor();
            int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println("Maximum area: " + sol.maxArea(height)); // Expected output: 49
        }
    }
    

