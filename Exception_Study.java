public class Exception_Study {

    public static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Age is Less");           // throw
        }
        else {
            System.out.println("Thank You");
        }
    }

    public static void main(String[] args){

        try {                                                       // try
            int no[]={1,2,3};
                System.out.println(no[5]);
            }
        catch (Exception e){                                        //  catch (Exception e)
            System.out.println("Wrong Index Value");
        }

        finally {                                                   // finally
            System.out.println("The try catch is Finished");
        }

        checkAge(15);
        }
    }

