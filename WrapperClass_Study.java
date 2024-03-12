public class WrapperClass_Study {
    public static void main(String[] args){

        System.out.println("Wrapper Class : ");
        System.out.println();

        Integer no = 300;

        // Same Answer in Console
        System.out.println("Number = "+no);
        System.out.println("Number = "+no.intValue());

        String str = no.toString();
        System.out.println("String Length = "+str.length());

    }
}
