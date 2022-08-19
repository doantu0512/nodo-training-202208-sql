import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;

public class CopyFileNioExample {
    public static void main(String[] args)throws Exception {
        try{
            File sourceFile = new File("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\nio_test.txt");
            File desFile = new File(sourceFile.getParentFile() ,"nio_test2.txt");
            FileChannel srcChannel = null;
            FileChannel desChannel = null;
            srcChannel = new FileInputStream(sourceFile).getChannel();
            desChannel = new FileOutputStream(desFile).getChannel();
            srcChannel.transferTo(0,srcChannel.size(),desChannel);
            Desktop.getDesktop().open(sourceFile.getParentFile());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}