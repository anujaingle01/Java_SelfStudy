package com.example.OOPS;

class Base_Shape{

    public void area(){
        System.out.println("1) Display Area of Shape");

    }
}

class Derived_Triangle extends Base_Shape{                  // Single Inheritance
    int h;
    int b;
    public void area(int h,int b){
        System.out.println("2) Display Area of Triangle");
    }
}

class Derived_Circle extends Derived_Triangle{             // Multi Level Inheritance
    int r;

    public void area(int r){
        System.out.println("3) Display Area of Circle");
    }
}

class Derived_Square extends Base_Shape{                  // Hierarchical Inheritance
    int l;
    int b;
    public void area(int l,int b){
        System.out.println("4) Display Area of Square");
    }
}

// User Defined Class = Containing All 3 Levels                  // Hybrid Inheritance


public class Inheritance {
    public static void main(String[] args){

        Base_Shape s1 = new Base_Shape();
        System.out.println("Inheritance Levels = ");
        System.out.println();
        s1.area();

        Derived_Triangle t1 = new Derived_Triangle();
        t1.h=2;
        t1.b=2;
        System.out.println();
        System.out.println("Single Level Inheritance : ");
        t1.area();
        t1.area(2,2);

        Derived_Circle c1 = new Derived_Circle();
        c1.r=2;
        System.out.println();
        System.out.println("Multi Level Inheritance : ");
        c1.area();
        c1.area(2);

        Derived_Square sq1 = new Derived_Square();
        sq1.l=2;
        sq1.b=2;
        System.out.println();
        System.out.println("Hierarchical Inheritance : ");
        sq1.area();
        sq1.area(2,2);

        System.out.println();
        System.out.println("Hybrid Inheritance : ");
        System.out.println("( Single + Multi + Hierarchical ) Levels ");


        // Package Study = Encapsulation.java File
        com.example.OOPS.Account a1 = new com.example.OOPS.Account();
        a1.name="customer";
    }

}
