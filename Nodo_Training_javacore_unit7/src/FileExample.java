import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file= new File("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7\\src\\FileExample");
        System.out.println("This is"+(file.isFile()?"file":"folder")+"!");
    }
}
