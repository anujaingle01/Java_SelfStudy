package com.example.OOPS;

// Interface cannot have Constructors
// Interface cannot have Functions / Methods
interface Animals{

    public void walk();
    int eye = 2;            // Constant , Final
}

interface Herbivore{
}


// Child Class Functions always be Public
class Dog implements Animals,Herbivore{                      // Multiple Inheritance
    public void walk(){
        System.out.println("Dog Walks on 4 Legs");
    }
    public void eat(){
        System.out.println("Dog eats Bone");
    }

}

public class Pure_Abstraction_Interface {           // Abstraction 2nd Type = Interface
    public static void main(String[] args){

        Dog a1 = new Dog();
        a1.walk();
        a1.eat();

    }
}
