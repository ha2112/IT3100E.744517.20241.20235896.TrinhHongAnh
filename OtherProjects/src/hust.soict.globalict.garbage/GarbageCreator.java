package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get("largefile.txt"));
            String content = "";
            for (byte b : inputBytes) {
                content += (char) b; // Inefficient concatenation
            }
            System.out.println("File content read successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
