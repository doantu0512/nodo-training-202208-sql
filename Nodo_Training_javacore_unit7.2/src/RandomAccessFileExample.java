import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7.2\\path_test.txt");
        ByteBuffer buffer = ByteBuffer.allocate(15);
        try (FileChannel fc = FileChannel.open(path)){
            fc.read(buffer);
            System.out.println(new String(buffer.array()));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
