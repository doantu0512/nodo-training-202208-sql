import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        String[] mang = {"Tú", "Kiên", "Ngu", "Hà", "Bự", "Hỏi"};
        System.out.println(mang[0]);
        List<String> list = new LinkedList<>(Arrays.asList(mang));

        list.forEach(value -> {

            System.out.println(value);
        });
    }
}
