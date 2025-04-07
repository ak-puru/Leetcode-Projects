class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int zero = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int swap = nums[zero];
                nums[zero] = nums[i];
                nums[i] = swap;
                zero++;
            }
        }
    }
}

    