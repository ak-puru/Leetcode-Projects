class Solution {
    public boolean containsDuplicate(int[] nums) { //taking in the array of nums as a parameter
        HashMap<Integer, Boolean> hash = new HashMap<>(); //creating a hashmap nder the instance hash, where the key is of Integer type and the value is of Boolean type. hash starts off empty. the Boolean value is kind of a placeholder, it doesnt really do anything valuable in this example

        for (int i=0; i<nums.length; i++) { //looping through the values (numbers) in the nums array
            if (hash.containsKey(nums[i])) { //if the "hash" hashmap already has the value that is in that particukar index of the nums array
                return true; // this means that the value has appeared before in the array and appears at least twice in the array, so the code should return true
            } else {
                hash.put(nums[i], true); //if hash does not already have the value, the value will be added to the hashmap and the loop will continue through the nums array
            }

        }
        return false; // this means that the code has finished looping through the nums array and all the values in the nums array are distinct.
    }
}