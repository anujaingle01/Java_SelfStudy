package com.example.OOPS;

class Students{                                       // User Defined Class
    String name;
    int age;

    public void student_info() {                  // public function
        System.out.println("Student Class created object & called : Student Info function.");
        System.out.println("Student Name = "+this.name);
        System.out.println("Student Age = "+this.age+" yrs");
    }

        Students(String name,int age){
            this.name=name;
            this.age=age;
        }
    }

public class Constructor_Function_with_parameter {                           // Main Class
    public static void main(String[] args){

        // Students == Constructor - With Parameters
        Students s1=new Students("Anuja Ingle",24);      // Class created Object with_parameter

        s1.student_info();
    }
}
