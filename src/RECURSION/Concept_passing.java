package RECURSION;

public class Concept_passing {
    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);

//       There is difference between  n-- and --n
//        in n-- first the number is passed in this case no 5 is passed then again no 5 is passed then
//       again 5 is passed that is infinite loop printing 5
//
//        In --n the number is first subtracted then passed to the function so the firstly
//       number is subtracted the passed to the function
    }
}
