class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> resMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(resMap.containsKey(diff)){
                return new int[]{resMap.get(diff), i};
            }
            resMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
