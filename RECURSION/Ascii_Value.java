package RECURSION;

import java.util.ArrayList;

public class Ascii_Value {
    public static void main(String[] args) {

        System.out.println(subseqAscii("", "abc"));


    }
    static ArrayList<String>  subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }



        char ch = up.charAt(0);

        ArrayList<String> first = subseqAscii(p + ch, up.substring(1));
        ArrayList<String> second = subseqAscii(p,up.substring(1));
        ArrayList<String>  third =  subseqAscii(p + (ch + 0), up.substring(1));      // exclude

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
