import java.util.Scanner;
/*Leetcode problem 45 jump game II
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump
1 step from index 0 to 1, then 3 steps to the last index.
 */

public class SolutionSixteen {
        public static int jump(int[] nums) {
            int c=0 , currfirst=0 , currlast=0;
            for(int i=0;i<nums.length-1;i++){
                currfirst=Math.max(currfirst,i+nums[i]);
                if(i==currlast){
                    c++;
                    currlast=currfirst;
                }
            }
            return c;
        }
        public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
   }
   System.out.println(jump(arr));
   }
}
