class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();  // Set to store characters in the window
        int left = 0, res = 0;  // left pointer for the start of the window, res stores the result
        
        // Iterate with the right pointer (end of the window)
        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, move the left pointer to remove the duplicate
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;  // Shrink the window from the left
            }
            
            // Add the current character to the set
            charSet.add(s.charAt(right));
            
            // Calculate the length of the current window and update the result
            res = Math.max(res, right - left + 1);
        }
        
        return res;
    }
}
