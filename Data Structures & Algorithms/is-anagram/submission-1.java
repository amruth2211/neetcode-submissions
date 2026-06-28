class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> countMap = new HashMap<>(); 
        for(char c: s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c: t.toCharArray()){
             countMap.put(c, countMap.getOrDefault(c, 0) - 1);
        }
        for(int i: countMap.values()){
            if(i!= 0){
                return false;
            }
        }
        return true;
    }
}
