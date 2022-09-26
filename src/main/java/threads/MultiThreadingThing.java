package threads;

public class MultiThreadingThing extends java.lang.Thread {

    private int threadNumber;

    public MultiThreadingThing(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i +" from thread number " + threadNumber);

//            if (threadNumber == 3)
//                    throw new RuntimeException();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
