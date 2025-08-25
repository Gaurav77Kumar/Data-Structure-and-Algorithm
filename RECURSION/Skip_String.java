package RECURSION;

public class Skip_String {
    public static void main(String[] args) {
        System.out.println(skipApp("bccapplehgyefv"));
        // Output: bccapplehgyefv (because "apple" is kept, only "app" is skipped)
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5)); // remove "apple"
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipApp(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApp(up.substring(3)); // remove "app" (but not "apple")
        } else {
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}
