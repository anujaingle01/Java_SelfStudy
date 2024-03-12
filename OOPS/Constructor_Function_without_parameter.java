package com.example.OOPS;

    class Student{                                       // User Defined Class
        String name;
        String age;

        public void student_info(){                  // public function
            System.out.println("Student Class created object & called : Student Info function.");
            System.out.println("Student Name = "+this.name);
            System.out.println("Student Age = "+this.age+" yrs");
        }

}

public class Constructor_Function_without_parameter {                           // Main Class
    public static void main(String[] args){

        // Student == Constructor - Without Parameters
        Student s1=new Student();                         // Class created Object without_parameter
        s1.name="Anuja Ingle";
        s1.age="24";

        s1.student_info();
    }
}
