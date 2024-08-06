public class SolutionFive {
    /**
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int c=0;
        for(int num:nums){
            c^=num;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a={2,2,1};
        int[] b={4,2,1,2,1};
        System.out.println(singleNumber(a));
        System.out.println(singleNumber(b));
    }
}