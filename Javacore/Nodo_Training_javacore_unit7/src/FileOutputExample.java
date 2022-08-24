import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "Users\\Admin\\Lamviec\\NODO_Training\\Nodo_Training_javacore_unit7" + File.separator + "hanoijava.txt");
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            String bytes = ("Hello Ha Noi java Class");
            outputStream.write(bytes.getBytes());
        } finally {
            if(outputStream !=null){
                outputStream.close();
            }
        }
//           File file = new File("D:" + File.separator + "Users\\Admin\\Lamviec\\NODO_Training" + File.separator + "hanoijava.txt");
//           FileInputStream inputStream = new FileInputStream(file);
//           try{
//               byte[] bytes= new byte[17];
//               inputStream.read(bytes);
//               System.out.println(new String(bytes));
//           } catch (IOException e) {
//               throw new RuntimeException(e);
//           }

    }
}
