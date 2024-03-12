package com.example.OOPS;

class Account{
    public String name;
    protected String email;
    int age;
    private String password;


     Account(){

    }
    // Getters & Setters

//       public String setPassword(String Password){
//        this.password = Password;
//        return this.password ;
//    }

    public String getPassword(String password){
        this.password=password;
        return this.password ;
    }
}


public class Encapsulation {
    public static void main(String[] args){

        System.out.println("Encapsulation = ");
        System.out.println();

        Account a1 = new Account();

        a1.name = "Anuja Ingle";                          // Public - Access Modifier
        System.out.println("Name = "+a1.name);

        a1.email = "anujamanikrao@gmail.com";             // Protected - Access Modifier
        System.out.println("Email = "+a1.email);

        a1.age = 24 ;                                     // Default - Access Modifier
        System.out.println("Age = "+a1.age);


        // Getters & Setters                              // Private - Access Modifier

//      System.out.println("Password = "+a1.setPassword("abcd"));
        System.out.println("Password = "+a1.getPassword("abcd"));
    }
}
