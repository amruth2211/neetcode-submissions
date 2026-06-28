class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> resMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int tmp = target - numbers[i];  
            if(resMap.containsKey(tmp))  {
                return new int[] {resMap.get(tmp), i+1};
            } 
            resMap.put(numbers[i], i + 1);
        }
        return new int[0];
    }
}
