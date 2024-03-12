package com.example.OOPS;

class Employee{
    String name;
    int id;

     public Employee(){         // Class Constructor = public only
         System.out.println("Class Employee - Constructor");
    }


    // Same Function Call = With Different Parameters
    // Function Overloading == Compile Time

    public void info(String name){
        System.out.println("Employee Name = "+this.name);
    }

    public void info(int id){
        System.out.println("Employee ID = "+this.id);
    }

    public void info(String name,int id){
        System.out.println("Employee Name = "+this.name);
        System.out.println("Employee ID = "+this.id);
    }

}
public class Polymorphism {
    public static void main(String[] args){

        System.out.println("Java OOPS Polymorphism : ");
        System.out.println();
        Employee e1 = new Employee();               // Calls : Class Employee - Constructor
        System.out.println();
        e1.name="Anuja Ingle";
        e1.id = 1;

        e1.info("Anuja");
        e1.info(0);
    }
}
