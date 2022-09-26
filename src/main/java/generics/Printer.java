package generics;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable> {

    //bonded generic
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.walk();
        System.out.println(thingToPrint);
    }

}
