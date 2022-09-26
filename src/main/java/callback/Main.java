package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        greeting("Pesho", null, value -> {
            System.out.println("No last name provided for " + value);
        });

        greetingWithNoInput("Ivan", null, () -> {
            System.out.println("No last name provided!");
        });

    }

    static void greeting(String firstName, String lastName, Consumer<String> callback){
        System.out.println("Hello " +firstName + "!");

        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }

    static void greetingWithNoInput(String firstName, String lastName, Runnable callback){
        System.out.println("Hello " +firstName + "!");

        if (lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }
}
