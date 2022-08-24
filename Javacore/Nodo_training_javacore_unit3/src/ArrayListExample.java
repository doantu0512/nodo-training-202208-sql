
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] mang = {"Tú", "Kiên", "Ngu", "Hà", "Bự", "Hỏi"};
        System.out.println(mang[2]);
        Collections.addAll(list, mang);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at " + i + " is " + list.get(i));
        }
    }
}