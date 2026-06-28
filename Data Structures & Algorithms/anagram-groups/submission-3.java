class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> countMap = new HashMap<>();
        for(String str: strs){
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            countMap.putIfAbsent(key, new ArrayList<>());
            countMap.get(key).add(str);
        }
        
        return new ArrayList<>(countMap.values());
    }
}
