import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.FileVisitResult.CONTINUE;

public class FileVisitorExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7.2");
        Files.walkFileTree(path,new PrintFiles());

    }

    public static class PrintFiles extends SimpleFileVisitor<Path>{
        public FileVisitResult visitFile(Path path){
            System.out.println(path + " is file!");
            return CONTINUE;
        }

        public FileVisitResult postVisitDirectory(){
            System.out.println(" is directory!");
            return CONTINUE;
        }
    }
}