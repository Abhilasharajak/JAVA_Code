import java.util.*;
public class SolutionTwo {
        public int maxProduct(int[] nums) {
           int maxproduct=Integer.MIN_VALUE;
           for(int i=0; i<nums.length;i++){
            int product=1;
            for(int j=i; j<nums.length;j++){
                product*=nums[j];
                if(product>maxproduct){
                    maxproduct=product;
                }
            }
           } 
           return maxproduct;

          // --------------------Second method----------------------
        //   int max = nums[0], min = nums[0], ans = nums[0];
        //   int n = nums.length;

        //   for (int i = 1; i < n; i++) {

        //       // Swapping min and max
        //       if (nums[i] < 0){
        //           int temp = max;
        //           max = min;
        //           min = temp;
        //       }

        //       max = Math.max(nums[i], max * nums[i]);
        //       min = Math.min(nums[i], min * nums[i]);

        //       ans = Math.max(ans, max);
        //   }

        //   return ans;



        }
        /**
         * @param args
         */
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            SolutionTwo ts = new SolutionTwo();
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0; i<n;i++){
                nums[i]=sc.nextInt();
            } 
            int result = ts.maxProduct(nums);
            System.out.println("Maximum Product: " + result);
        }
    }