package OOPS;

class Student {
    int roll_no;
    String name;
    float marks;

    // we need one word to access every object



    void greeting() {
        System.out.println("Hello how are you " + name);
    }

    void changename(String newname){
        name = newname;

    }

    Student () {

        // This is how you call a constructor from another constructor

        this(13, "Sanjana", 32.2f);
    }

    // Student sanjana = new Student(13, "sanjana", 98.2f)
    // here, this will be replaced with sanajana

    Student(int roll, String name, float marks){
        this.roll_no = roll;
        this.name  = name;
        this.marks = marks;
    }
}

public class Class_Object {
    public static void main(String[] args) {
        Student gaurav = new Student();

//        System.out.println(gaurav.roll_no);
//        System.out.println(gaurav.name);
//        System.out.println(gaurav.marks);

//        gaurav.greeting();
//
//        gaurav.changename("Kunal");

//        Student random2 = new Student();
//        System.out.println(random2.name);


//         One is in stack memory and object is created in heap memory and then
//         I created two in stack and memory and also two is pointed to the heap memory
//         so when i change something in the one that is also visible in the two


        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);




    }
}

