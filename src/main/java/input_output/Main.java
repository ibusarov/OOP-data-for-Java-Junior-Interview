package input_output;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] names = {"Pesho", "Ivan", "Ani"};

        BufferedWriter bf = new BufferedWriter(new FileWriter("output.txt"));

        bf.write("Write to a file.");
        bf.write("\nHere is another line.");


        Arrays.stream(names).forEach(name -> {
            try {
                bf.write("\n" + name);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bf.close();

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
