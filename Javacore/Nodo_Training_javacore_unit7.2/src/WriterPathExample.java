import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriterPathExample {
    public static void main(String[] args) {
        Path path = Paths.  get("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7.2");
        Charset charset = Charset.forName("UTF8");
        try (BufferedWriter writer = Files.newBufferedWriter(path,charset)){
            for(int i=0;i<10;i++){
                writer.write("Hạ Việt "+i+"\r\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}