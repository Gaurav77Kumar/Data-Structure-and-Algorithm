package Sliding_Window;
import java.util.HashMap;

public class Count_Occurence0f_Anagrams {
    public static int anagrams(String txt, String pat) {
        int n = txt.length();
        int k = pat.length();

        if (k > n) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency of pattern
        for (char ch : pat.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();
        int i = 0;
        int j = 0;
        int ans = 0;

        while (j < n) {
            char rightChar = txt.charAt(j);

            // Step 2: decrease frequency of current char
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);

                if (map.get(rightChar) == 0) {
                    count--;
                }
            }

            // Window size < k
            if (j - i + 1 < k) {
                j++;
            }

            // Window size == k
            else if (j - i + 1 == k) {


                if (count == 0) {
                    ans++;
                }

                char leftChar = txt.charAt(i);

                // Step 3: restore frequency of left char
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String txt = "forxxorfxodofr";
        String pat = "for";

        System.out.println("ans is "+anagrams(txt, pat));
    }
}