class Solution {
    public int longestConsecutive(int[] nums) {
        //take longest consecutive sequence. Think like an HashMap
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums){
            numSet.add(num);
        }

        int longest = 0;
        for(int num: numSet){
            if(!numSet.contains(num - 1)){
                int length = 1;
                while(numSet.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;

    }
}
