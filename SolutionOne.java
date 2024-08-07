<<<<<<< HEAD
import java.util.HashMap;

public class SolutionOne {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Return -1, -1 if no solution is found
    }

    public static void main(String[] args) {
        SolutionOne ts = new SolutionOne();
        int[] nums = {7, 11, 15,2};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
=======
import java.util.HashMap;

public class SolutionOne {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Return -1, -1 if no solution is found
    }

    public static void main(String[] args) {
        SolutionOne ts = new SolutionOne();
        int[] nums = {7, 11, 15,2};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
>>>>>>> 47cff0662cc93605fa9a9bf6966888c1950d813b