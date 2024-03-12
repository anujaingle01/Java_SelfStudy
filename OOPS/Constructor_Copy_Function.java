package com.example.OOPS;

class Stud{                                       // User Defined Class
    String name;
    int age;

    public void student_info() {                  // public function
        System.out.println("Student Class created object & called : Student Info function.");
        System.out.println("Student Name = "+this.name);
        System.out.println("Student Age = "+this.age+" yrs");
    }

    Stud(Stud s2){
        // Student == Constructor with Parameters
        this.name=s2.name;
        this.age=s2.age;
    }

    Stud(){
    }

}

public class Constructor_Copy_Function{                           // Main Class
    public static void main(String[] args){

        Stud s1=new Stud();      // Class created Object with_parameter
        s1.name="Anu";
        s1.age=24;

        // Stud == Constructor - Copy Function
        Stud s2=new Stud(s1);
        s2.student_info();
    }
}
