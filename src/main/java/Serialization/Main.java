package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\igobu\\Desktop\\Java\\7JavaProjects\\SuperJohn\\output.txt";

        Cube cube = new Cube("red", 100, 100, 5);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        oos.writeObject(cube);
    }
}
