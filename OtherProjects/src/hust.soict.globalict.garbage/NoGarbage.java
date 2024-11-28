package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get("largefile.txt"));
            StringBuilder content = new StringBuilder();
            for (byte b : inputBytes) {
                content.append((char) b); // Efficient concatenation
            }
            System.out.println("File content read successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
