class Solution {
    public int characterReplacement(String s, int k) {
        //We have a variable-size wndow that expands and contracts based on validity conditions
        //When we have a sliding window with variable size we take the two pointers to define and adjust thw windkw boundariesabstract
        int res = 0;
        HashSet<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()){
            charSet.add(c);
        }

        for (char c : charSet) {
            int count = 0, l = 0;
            for (int r = 0; r < s.length(); r++){
                if(s.charAt(r) == c){
                    count++;
                }

                while ((r - l + 1) - count > k) {
                    if(s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }

                res = Math.max(res, r - l +1);
            }
        }
        return res;

    }
}
