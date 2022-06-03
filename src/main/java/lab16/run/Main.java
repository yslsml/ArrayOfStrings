package lab16.run;
import lab16.read.ReadData;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "data/input.txt";
            ArrayList<String> strings = ReadData.readData(path);
            Collections.reverse(strings);
            Files.write(Paths.get("data/output.txt"), strings);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
