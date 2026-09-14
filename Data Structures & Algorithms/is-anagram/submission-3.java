class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sCountMap = new HashMap<>();
        Map<Character, Integer> tCountMap = new HashMap<>();

        for(Character a: s.toCharArray()){
            sCountMap.put(a, sCountMap.getOrDefault(a, 0) + 1);
        }

        for(Character b: t.toCharArray()){
            tCountMap.put(b, tCountMap.getOrDefault(b, 0) + 1);
        }

        return sCountMap.equals(tCountMap);
    }
}
