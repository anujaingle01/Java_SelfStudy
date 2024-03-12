//import java.math.BigInteger;
//
//public class Gcd {
//    public static void main(String [] args){
//
//        String s1="12";
//        String s2="18";
//
//        BigInteger a = new BigInteger(s1);
//        BigInteger b = new BigInteger(s2);
//
//        BigInteger Total = a.gcd(b);
//        System.out.println("GCD of "+s1+" & "+s2+" = "+Total);
//
//    }

    import java.util.*;

        public class Gcd {
            public static void main(String args[]) {

                Scanner sc = new Scanner(System.in);
                System.out.print("n1 = ");
                int n1 = sc.nextInt();
                System.out.print("n2 = ");
                int n2 = sc.nextInt();


                while(n1 != n2) {
                    if(n1>n2) {
                        n1 = n1 - n2;
                    } else {
                        n2 = n2 - n1;
                    }
                }
                System.out.println("GCD is : "+ n1);
            }
        }
