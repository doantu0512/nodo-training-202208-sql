import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {
    public static void main(String[] args) throws Exception{
        File file= new File("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\random.txt");
        RandomAccessFile randomAccessFile= new RandomAccessFile (file,"rw");
        try {
            randomAccessFile.seek(1);
            byte[] bytes = new byte[4*102];
            int read= randomAccessFile.read(bytes);
            System.out.println(new String(bytes,0, read,"utf8"));
            randomAccessFile.seek(file.length());
            randomAccessFile.write("\r\n".getBytes());
            randomAccessFile.writeChars("hello co can");
            Desktop.getDesktop();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
