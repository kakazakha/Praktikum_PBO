import java.io.*;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan saat membaca file: " + e.getMessage());
        }

    }
}
