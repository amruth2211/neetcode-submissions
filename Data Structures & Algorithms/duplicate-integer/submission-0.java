class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> countSet = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(countSet.contains(nums[i])){
                return true;
            }
            countSet.add(nums[i]);
        }
        return false;
    }
}
