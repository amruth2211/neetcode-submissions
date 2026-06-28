class Solution {
    public int characterReplacement(String s, int k) {
        
        // HashMap to keep count of characters in the current window
        HashMap<Character, Integer> count = new HashMap<>();
        
        int l = 0;        // Left pointer of the sliding window
        int maxf = 0;     // Max frequency of any single character in the current window
        int res = 0;      // Result: the length of the longest valid substring

        // Loop through the string with the right pointer
        for (int r = 0; r < s.length(); r++) {

            // Add the current character at position 'r' to the count map
            char rightChar = s.charAt(r);
            count.put(rightChar, count.getOrDefault(rightChar, 0) + 1);

            // Update the max frequency of any character seen in the current window
            maxf = Math.max(maxf, count.get(rightChar));

            // If the number of characters to change exceeds k, shrink the window
            // (r - l + 1) is the size of the window
            // We want at most k characters to be different from the most frequent one
            while ((r - l + 1) - maxf > k) {
                char leftChar = s.charAt(l);
                count.put(leftChar, count.get(leftChar) - 1); // Decrease count of left char
                l++; // Move left pointer to the right
            }

            // Update result with the size of the current valid window
            res = Math.max(res, r - l + 1);
        }

        // Return the maximum length of valid substring found
        return res;
    }
}
