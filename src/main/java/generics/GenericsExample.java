package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericsExample {

    public static void main(String[] args) {
//        Printer<Integer> printer = new Printer<>(55);
//
//        printer.print();

        Printer<Cat> cats =  new Printer<>(new Cat());

        System.out.println("CAT");
        System.out.println(22);
        System.out.println(77.8);

        List<Integer> customList = new ArrayList<>();

        customList.add(55);
        customList.add(99);
        printList(customList);

        List<Cat> kitten = new ArrayList<>();
        kitten.add(new Cat(10,77));

        printList(kitten);


        System.out.println(customList.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        System.out.println(kitten.stream().map(String::valueOf).collect(Collectors.joining()));


    }

    private static <T> void shout(T thingToPrint){
        System.out.println(thingToPrint);
    }

    private static void printList(List<?> myList){
        System.out.println("Awesome list .... " + myList.toString()
                .replace("[", "").replace("]", ""));
    }
}
