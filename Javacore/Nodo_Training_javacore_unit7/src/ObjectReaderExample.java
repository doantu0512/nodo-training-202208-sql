import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class ObjectReaderExample {
    public static void main(String[] args) throws Exception{
        File folder = new File("D:\\Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7");
        ObjectInputStream inputStream= new ObjectInputStream(
        new FileInputStream(new File(folder,"my_project")));
        Object obj = inputStream.readObject();
        Method method = obj.getClass().getMethod("run",new Class[0]);
        method.invoke(obj,new Object[0]);
        inputStream.close();
    }
}