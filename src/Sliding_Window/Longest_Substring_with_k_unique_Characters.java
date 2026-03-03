package Sliding_Window;
import java.util.HashMap;

// we have to find the longest substring with k unique character in a given string


public class Longest_Substring_with_k_unique_Characters {
    public static int longestSubstringKUnique(String s, int k) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
                j++;
            }
        }
        return maxLength;
    }

        public static void main (String[]args) {
            String s = "aabacbebebe";
            int k = 2;
            System.out.println("Length of the longest substring with " + k + " unique characters is: " + longestSubstringKUnique(s, k));

        }
}
