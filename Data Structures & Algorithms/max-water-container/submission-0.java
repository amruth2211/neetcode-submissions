class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int res = 0;

        int highest = 0;
        int l=0, r=n-1, max = 0;
        while(l<r){
            int temp = Math.min(heights[l], heights[r])*(r-l);
            highest = Math.max(highest, temp);

            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return highest;
    }
}
