import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class FileSize {
    public static long getSize(File file) {
        if (file.isFile()== true) {
            return file.length();
        }
//        File[] files= file.listFiles();
//        int length =0;
//        for (int i = 0;i< files.length;i++) {
//            if (files[i].isFile()) {
//                length +=getSize(files[i]);
//                continue;
//            }
//            length+= files[i].length();
//        }
//        return length;
        AtomicLong length=null;
        Arrays.stream(file.list()).forEach(f->{
            length.getAndSet(length.longValue()+(file.isFile()? getSize(file):file.length()));
        });
        return length.longValue();
    }

    public static void main(String[] args) {
        File file = new File("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\src\\FileSize");
        System.out.println("Size"+getSize(file)/(1024*1024)+"MB");
    }
}
