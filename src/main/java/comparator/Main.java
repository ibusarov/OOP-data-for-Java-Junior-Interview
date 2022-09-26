package comparator;

import com.sun.security.jgss.GSSUtil;

import java.nio.channels.ByteChannel;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Bicycle> bike = Arrays.asList(new Bicycle("ABC1", 100),
                new Bicycle("ABC2", 200),
                new Bicycle("ABC3", 300));

        List<Animal> animals = new ArrayList<>(Arrays.asList(new Animal("Pesho", 5),
                new Animal("Inan", 10),
                new Animal("Ani", 15)));

        animals.stream().sorted(Comparator.comparing(Animal::getAge,(f, s) -> {
            return s.compareTo(f);
        })).forEach(System.out::println);
        System.out.println("=============================================");

        bike.stream().sorted(Bicycle::compareTo).forEach(System.out::println);

        List<Integer> numbers =  Arrays.asList(5, 3, 50, 24, 77);

        System.out.println("=============================================");

        numbers.stream().sorted((f, s) -> s.compareTo(f)).forEach(System.out::println);

        System.out.println("=============================================");

        BicycleComparator bbb = new BicycleComparator();

        bike.stream().sorted(bbb::compare).forEach(System.out::println);

        System.out.println("=============================================");

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("=============================================");
        Collections.sort(bike, (f, s) -> s.getFrameSize().compareTo(f.getFrameSize()));
        bike.stream().forEach(System.out::println);
    }






}
