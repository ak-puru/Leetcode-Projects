class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                int[] output = {i,j};
                if (nums[i]+nums[j] == target) {
                    
                    return output;  
                } else {continue;}
            }
        }return new int[]{};
    }
}