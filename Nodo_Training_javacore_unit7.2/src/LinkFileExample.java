import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;

public class LinkFileExample {
    public static void main(String[] args) throws IOException{
        Path soure = Paths.get( "D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7.2\\path_test.txt");
        Path target = Paths.get("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7.2\\path_test2.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(soure,Charset.defaultCharset(), StandardOpenOption.APPEND)){
            writer.write("Java NIO 2 example \r\n");
        }

        try(BufferedReader reader = Files.newBufferedReader(target,Charset.defaultCharset())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}