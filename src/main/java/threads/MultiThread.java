package threads;

public class MultiThread {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) {
            MultiThreadingThingInterface myThing = new MultiThreadingThingInterface(i);
            Thread myThread = new Thread(myThing);
            myThread.start();

//            try {
//                myThread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

//        throw new RuntimeException();
    }
}
