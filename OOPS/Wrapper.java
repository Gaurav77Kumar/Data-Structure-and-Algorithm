package OOPS;

public class Wrapper {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 34;

        Integer a = 10;
        Integer b = 98;
        swap(a,b);
        System.out.println(a + " " + b);

    }
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}








