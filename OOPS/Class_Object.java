package OOPS;

class Student {  // Class is a blueprint from which we can create objects and in simple words it is a user defined data type
    int roll_no;  // these are the properties of the class
    String name;  // default value of string is null
    float marks;  // default value of float is 0.0

    // we can also have functions inside the class and these functions are called methods

    void greeting() {
        System.out.println("Hello how are you " + name);
    }
    void changename(String newname){
        name = newname;
    }

    Student () {  // This is a constructor and it is used to initialize the object like setting the value of properties when the object is created
        this(13, "Sanjana", 32.2f);
    }

    // Student sanjana = new Student(13, "sanjana", 98.2f)
    // here, this will be replaced with sanajana

    Student(int roll, String name, float marks){ // This is a parameterized constructor
        this.roll_no = roll; // Ye roll same hoga to the argument in the Student like roll
        this.name  = name;
        this.marks = marks;
    }
}

public class Class_Object {
    public static void main(String[] args) {
        Student gaurav = new Student();  // This is how we create an object of a class and new is used to allocate memory in heap
        // new Student() is used to call the constructor of the class Student
        // gaurav is the reference variable which is used to access the object
        // Student() is the constructor of the class Student

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


        Student one = new Student();  // one is reference variable pointing to the object created in heap memory
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);




    }
}

