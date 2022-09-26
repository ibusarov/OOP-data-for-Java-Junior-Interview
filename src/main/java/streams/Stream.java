package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Stream {
    public static void main(String[] args) {

        //1. Print numbers from 1 to 10
        System.out.println("1. Print numbers from 1 to 10");
        IntStream
                .range(1, 11)
                .forEach(x -> System.out.print(x +" "));
        System.out.println();
        System.out.println("==============================");

        //2. Skip function
        System.out.println("2. Skip function");
        IntStream
                .range(1, 11)
                .skip(5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("==============================");

        //3 Sum function
        System.out.println("3 Sum function");
        System.out.println(IntStream
                .range(1, 11)
                .sum());
        System.out.println();
        System.out.println("==============================");

        //4. Sorted and find first
        System.out.println("4. Sorted and find first");

        java.util.stream.Stream.of("Ava", "Ani", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();
        System.out.println("==============================");

        //5. Stream of Arrays
        System.out.println("5. Stream of Arrays");
        String [] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("==============================");

        //6. Average of int squares
        System.out.println("6. Average of int squares");
        Arrays.stream(new int[]{2,4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println("==============================");

        //7. Filter list
        System.out.println("7. Filter list");
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Sika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("==============================");

        //8. Stream rows from text file
        try {
            java.util.stream.Stream<String> bands = Files.lines(Paths.get("src/main/resources/bands.txt"));

            bands
                    .sorted()
                    .filter(x -> x.length() > 13)
                    .forEach(System.out::println);
            bands.close();
        } catch (IOException e) {
            throw new RuntimeException(String.valueOf(e.getStackTrace()));
        }

    }
}
