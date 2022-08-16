import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,new String[]{"Tu","Vuong","Kien","Manh"});
        Collections.sort(list);
        for (String s: list) {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println("Vi trí thứ: " + Collections.binarySearch(list, "Manh"));
    }
}
