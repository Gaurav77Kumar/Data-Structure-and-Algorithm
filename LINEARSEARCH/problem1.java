package LINEARSEARCH;

public class problem1 {
    public static void main(String[] args) {
        String name = "Gaurav";
        char target = 'v';
        System.out.println(Search(name, target));
    }

    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        } else {
            for(int i = 0; i < str.length(); ++i) {
                if (target == str.charAt(i)) {
                    return true;
                }
            }

            return false;
        }
    }
}

