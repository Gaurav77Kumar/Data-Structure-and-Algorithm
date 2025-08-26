package RECURSION;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        // print version
        subseq("", "abc");

        // return version
        ArrayList<String> result = subSeq("", "abc");
        System.out.println(result);
    }


    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1)); // include
        subseq(p, up.substring(1));      // exclude
    }


    static ArrayList<String> subSeq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // recursive calls
        ArrayList<String> left = subSeq(p + ch, up.substring(1));
        ArrayList<String> right = subSeq(p, up.substring(1));

        // combine
        left.addAll(right);
        return left;
    }
}
