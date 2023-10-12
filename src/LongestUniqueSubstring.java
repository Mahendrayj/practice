import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                // If the current character is already in the map, update the left pointer
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "qweqweqq";
        String s2 = "qwwerw";

        int result1 = lengthOfLongestSubstring(s1);
        int result2 = lengthOfLongestSubstring(s2);

        System.out.println("Input: " + s1);
        System.out.println("Output: " + result1);

        System.out.println("Input: " + s2);
        System.out.println("Output: " + result2);
    }
}


