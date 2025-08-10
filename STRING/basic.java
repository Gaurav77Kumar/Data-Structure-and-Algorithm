package STRING;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println ((char)('a' + 3)); // Integer will be converted into integer that will call toString()

        System.out.println("Gaurav" + new ArrayList<>());


    }
}
