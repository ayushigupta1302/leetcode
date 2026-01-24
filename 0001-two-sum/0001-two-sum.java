class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            // Check if the complement exists in the map
            if (mpp.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] {mpp.get(complement), i};
            }
            // Store the current number and its index
            mpp.put(num, i);
        }
        // If no solution found, return an empty array or throw an exception
        return new int[] {-1, -1};
    }
}