package record;

import java.io.Serializable;

public final record Cat(String name, int age) implements Serializable {

    public static void something(){
        System.out.println("I wrote something...");
    }
}
