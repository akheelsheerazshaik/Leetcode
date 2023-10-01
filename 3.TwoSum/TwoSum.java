import java.util.Map;
import java.util.HashMap;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the elements and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // First pass: Populate the HashMap with elements and indices
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Second pass: Iterate through the array and find the complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is in the HashMap and not the same element
            if (map.containsKey(complement) && map.get(complement) != i) {
                // Return the indices of the two numbers as an array
                return new int[] { i, map.get(complement) };
            }
        }

        // If no solution is found, return null
        return null;
    }
    public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
   TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(nums, target);
    System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
}
}
