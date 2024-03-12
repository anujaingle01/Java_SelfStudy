
//public class Thread_Study extends Thread {                                // Class extends Thread
//    public static void main(String[] args) {
//
//        Thread_Study thread = new Thread_Study();
//        thread.start();
//        System.out.println("This code is outside of a Thread");
//    }
//    public void run(){
//        System.out.println("This code is running in a Thread");
//    }
//
//}



//public class Thread_Study implements Runnable {                             // Class implements Runnable
//    public static void main(String[] args) {
//
//        Thread_Study obj = new Thread_Study();
//        Thread thread = new Thread(obj);
//        thread.start();
//        System.out.println("This code is outside of a Thread");
//    }
//    public void run(){
//        System.out.println("This code is running in a Thread");
//    }
//
//}



//public class Thread_Study extends Thread {                       // Concurrency Problem - Unpredictable
//    public static int amount = 0;
//
//    public static void main(String[] args) {
//
//        Thread_Study thread = new Thread_Study();
//        thread.start();
//        System.out.println(amount);       // 0
//        amount++;
//        System.out.println(amount);       // 2
//    }
//    public void run(){
//        amount++;
//    }
//
//}



public class Thread_Study extends Thread {            // Concurrency Problem - Predictable  =  isAlive()
    public static int amount = 0;

    public static void main(String[] args) {

        Thread_Study thread = new Thread_Study();
        thread.start();

        while (thread.isAlive()){
            System.out.println("Waiting = ");
        }

        // Update Amount & Print its Value
        System.out.println(amount);     // 1
        amount++;
        System.out.println(amount);     // 2
    }

    public void run(){
        amount++;
    }

}



