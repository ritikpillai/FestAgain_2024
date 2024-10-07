//So in this code we required to find two numbers in an array that sum up to a given target.


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        int sizeOfArray = nums.length;

        for (int i = 0; i < sizeOfArray; i++) {
            int diff = target - nums[i];

            if (numToIndexMap.containsKey(diff)) {
                
                System.out.println("Numbers is: " + nums[i] + " and " + nums[numToIndexMap.get(diff)]);
                 return new int[]{i, numToIndexMap.get(diff)};
            }

            numToIndexMap.put(nums[i], i);
        }
        System.out.println("No pair ");
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9; 
        twoSum(nums, target);
    }
}
