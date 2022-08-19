
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterExample {
    public static void main(String args[])  throws Exception{
//        try {
//            FileWriter fw = new FileWriter("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\random.txt");
//            fw.write("\r\n");
//            fw.write("Welcome to java.");
//            Desktop.getDesktop();
//            fw.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Success...");
        try {
            FileReader fd= new FileReader("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\random.txt");
            char[] buffer= new char[4*1024];
            int read=-1;
            StringBuilder builder= new StringBuilder();
            while ((read= fd.read(buffer))!=-1){
                builder.append(buffer,0,read);
            }
            System.out.println(builder);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
