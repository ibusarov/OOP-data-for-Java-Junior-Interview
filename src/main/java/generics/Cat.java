package generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private int years;
    private int walingDistance;

    public Cat() {
        super();
    }

    public Cat(int years, int walingDistance){
        super(walingDistance);
        this.years = years;
    }

    @Override
    public String toString() {
        return String.format("I am a small cat and I am %d  years old!!!", this.years);
    }
}
