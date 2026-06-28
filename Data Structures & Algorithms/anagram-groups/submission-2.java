class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resMap = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            resMap.putIfAbsent(key, new ArrayList<>());
            resMap.get(key).add(s);
        }

        return new ArrayList<>(resMap.values());
    }
}
