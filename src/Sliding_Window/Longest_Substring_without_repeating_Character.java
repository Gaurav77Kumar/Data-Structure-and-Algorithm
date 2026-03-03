package Sliding_Window;

import java.util.HashMap;

public class Longest_Substring_without_repeating_Character {
    public static int lengthOfLongestSubstringnrepeatingcharacter(String s) {
        int i = 0;
        int j = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // If duplicate exists (window invalid)
            if (map.get(ch) > 1) {
                while (map.get(ch) > 1) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);

                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
            }
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("Length of the longest substring without repeating characters is: " + lengthOfLongestSubstringnrepeatingcharacter(s));
    }
}