public class LongestDistinctCharacters {
    public static int longestDistinctSubstring(String s) {
        int[] seen = new int[256];  // Array to track characters (ASCII set)
        int maxLength = 0;
        int start = 0;

        // Iterate using a single for loop
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Move start forward to ensure all characters in the window are distinct
            while (seen[currentChar] > 0) {
                seen[s.charAt(start)]--;  // Remove character at start
                start++;
            }

            // Add current character to the seen array
            seen[currentChar]++;
            // Calculate the current window length and update max length if needed
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of longest substring with distinct characters: " + longestDistinctSubstring(str));
    }
}
