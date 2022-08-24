import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockFileNioExample {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\nio_test.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel channel = raf.getChannel();
        long value = channel.size();
        FileLock lock = channel.tryLock(0, value, false);
        Desktop.getDesktop().edit(file);
        Thread.sleep(15 * 1000);
        lock.release();
    }
}
