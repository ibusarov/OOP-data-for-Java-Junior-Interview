package design_patterns.creational.singleton;

public class SomeSingleton {
    private static SomeSingleton single_instance = null;
    private SomeSingleton(){
    }

    public static SomeSingleton getInstance(){
        if (single_instance == null){
            single_instance = new SomeSingleton();
        }

        return single_instance;
    }
}
