package com.example.OOPS;

class Children{
    String name;
    static String school;                       // Static keyword = Constant

     static void changeschool(){                // Static Method
        school = "JMV Convent School";
        System.out.println("Updated School Name = "+school);
    }

    public void changename(){                   // Public Method
        name = "Maya Manikrao Ingle";
        System.out.println("Updated Name = "+name);
    }
}

public class Static {
    public static void main(String[] args){

        Children c1 = new Children();
        c1.name = "Maya";
        c1.name = "Manikrao";
        c1.changename();                            // Call Public Method by creating Object of a Class

        System.out.println();

        Children.school = "N.N.K.C. School";        // Static Keyword is used Directly with Class
        System.out.println("School Name = "+Children.school);

        Children.changeschool();                    // Call Static Method without creating Object of a Class
    }
}
