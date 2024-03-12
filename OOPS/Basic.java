package com.example.OOPS;

class Pen {                                       // User Defined Class
    String color;
    String type;

    public void write() {                  // public function
        System.out.println("Pen Class created object & called : Write function.");
        System.out.println("Pen Color = " + this.color);
        System.out.println("Pen Type = " + this.type);
    }

    //     static void writes(){              // static function
    //     System.out.println("Pen Class created object & called Write function.");
    //    }

}
public class Basic {
    public static void main(String[] args) {

        Pen pen1 = new Pen();                         // Class created Object
        pen1.color = "Blue";
        pen1.type = "Gel Pen";

        pen1.write();                               // Object called public function
//      pen1.writes();                              // Object called static function

    }
}
