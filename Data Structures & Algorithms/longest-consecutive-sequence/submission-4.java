class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> consSet = new TreeSet<Integer>();
        int size = nums.length;
        if(size == 0) return 0;
        for(int i =0; i<size; i++) {
            consSet.add(nums[i]);
        }
        int count = 1;
        int maxCount = 0;
        boolean isFirst = true;
        long prevVal = 0; 
        int s = consSet.size();
        consSet.forEach(val -> System.out.println(val));
        for(Integer val : consSet) {
            if(isFirst) {
                System.out.println("in first if");
                isFirst = false;
                prevVal = val;
            }
            else {
                System.out.println("in first else");
                if(prevVal+1 == val) {
                    System.out.println("in inner if");
                    count++;
                } else {
                    System.out.println("in inner else");
                    if(count > maxCount) {
                        System.out.println("in inner if 1");
                        maxCount = count;
                        count = 1;
                    } else {
                        count = 1;
                    }
                }
                System.out.println("Count: " + count);
                prevVal = val;
            }
        }
        if(count > maxCount) maxCount = count;
        return maxCount;
    }
}
