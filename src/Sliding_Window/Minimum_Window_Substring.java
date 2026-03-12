package Sliding_Window;
import java.util.HashMap;

public class Minimum_Window_Substring {
    public static String minWindow(String s, String t){
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);

        }
        int count = map.size();
        int minLength = Integer.MAX_VALUE;

        String ans ="";
        while( j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) -1);
                if(map.get(ch) == 0){
                    count--;
                }
            }
            while(count == 0){
                if(j - i +1 < minLength){
                    minLength = j - i +1;
                    ans = s.substring(i, j+1);
                }
                char leftChar = s.charAt(i);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) +1);
                    if(map.get(leftChar) > 0){
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        return ans;

    }
    public static void main(String[] args){
        String s = "timetopractice";
        String t = "toc";
        System.out.println(minWindow(s, t));
    }
}
