package RECURSION;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("madam"));

    }
    static boolean palindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return palindrome(str.substring(1,str.length()-1));


    }
}
