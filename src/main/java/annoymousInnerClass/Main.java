package annoymousInnerClass;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        Animal bigfoot = new Animal(){

            public void makeNoise(){
                System.out.println("Grrrrrr");
            }
        };

        bigfoot.makeNoise();

        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonymous...");
            }
        };

        myAnonymousRunnable.run();
    }
}
