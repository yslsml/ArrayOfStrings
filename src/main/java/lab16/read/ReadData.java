package lab16.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static ArrayList<String> readData(String path) throws IOException {
        ArrayList<String> listStr = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            listStr.add(line);
        }
        return listStr;
    }
}
