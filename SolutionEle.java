import java.util.*;

public class SolutionEle {
    public static int remove_duplicate(List<Integer> arr) {
        int n = arr.size();
        if (n == 0 || n == 1) {
            return n;
        }

        // Sort the list
        Collections.sort(arr);

        // Use a temporary list to store unique elements
        List<Integer> temp = new ArrayList<>();
        temp.add(arr.get(0));

        for (int i = 1; i < n; i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                temp.add(arr.get(i));
            }
        }

        // Copy the unique elements back to the original list
        for (int i = 0; i < temp.size(); i++) {
            arr.set(i, temp.get(i));
        }

        // Return the number of unique elements
        return temp.size();
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        int newSize = remove_duplicate(arr);
        System.out.println("New size: " + newSize);
        System.out.println("Array after removing duplicates: " + arr.subList(0, newSize));
    }
}
