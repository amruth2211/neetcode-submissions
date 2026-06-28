class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*We can solve this problem by prefix/suffix. finding product of all left side elements
        and multiply by right side elements for an number at i */
        int n = nums.length;
        int[] out = new int[n];

        //prefix
        out[0] = 1;
        for(int i = 1; i < n; i++){
            out[i] = out[i - 1] * nums[i - 1];
        }

        //sufix
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            out[i] *= suffix;
            suffix *= nums[i];
        }

        return out;
    }
}  
