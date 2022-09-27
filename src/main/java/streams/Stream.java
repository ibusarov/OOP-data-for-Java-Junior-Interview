package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Stream<S> {
    public static void main(String[] args) {

        //1. Print numbers from 1 to 10
        System.out.println("1. Print numbers from 1 to 10");
        IntStream
                .range(1, 11)
                .forEach(x -> System.out.print(x + " "));
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
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();
        System.out.println("==============================");

        //6. Average of int squares
        System.out.println("6. Average of int squares");
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
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
        System.out.println("8. Stream rows from text file");
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

        System.out.println();
        System.out.println("==============================");

        //9. Stream rows from text file and save to file

        System.out.println("9. Stream rows from text file and save to file");
        try {
            List<String> bandsList = Files.lines(Paths.get("src/main/resources/bands.txt"))
                    .filter(x -> x.length() > 15)
                    .toList();
            bandsList.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("==============================");

        //10. Stream from csv file
        System.out.println("10. Stream from csv file");
        try {
            java.util.stream.Stream<String> rows = Files.lines(Paths.get("data.txt"));
            long countRows = rows
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .count();
            System.out.println(countRows + " rows");
            rows.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("==============================");

        //11. Parse data from rows csv file
        System.out.println("11. Parse data from rows csv file");

        try {
            java.util.stream.Stream<String> rowsParse = Files.lines(Paths.get("data.txt"));

            rowsParse
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .filter(x -> Integer.parseInt(x[1]) > 15)
                    .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
            rowsParse.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("==============================");

        // 12. Stream from csv file store in hashmap

        System.out.println("12. Stream from csv file store in hashmap");

        try {
            java.util.stream.Stream<String> rowsMap = Files.lines(Paths.get("data.txt"));

            Map<String, Integer> map = new HashMap<>();

            map = rowsMap
                    .map(x -> x.split(","))
                    .filter(x -> x.length == 3)
                    .filter(x -> Integer.parseInt(x[1]) > 15)
                    .collect(Collectors.toMap(
                            x -> x[0],
                            x -> Integer.parseInt(x[1])
                    ));
            rowsMap.close();

            for (String key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("==============================");

        //13. Reduce function
        System.out.println("13. Reduce function");
        Double sum = java.util.stream.Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, Double::sum);
        System.out.println(sum);

        System.out.println();
        System.out.println("==============================");

        //14. Summary statistics
        System.out.println("14. Summary statistics");
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);

    }
}
