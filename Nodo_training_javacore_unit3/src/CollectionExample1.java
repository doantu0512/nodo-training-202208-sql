import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample1 {
    public static void main(String[] args) {
        Short[] values = {1,2,4,5,6,7,8,9};
        List<Short> list = new ArrayList<Short>();
        Collections.addAll(list,values);
        Collections.reverse(list);//Đảo ngược list
        list.toArray(values);
        for (Short s: values) {
            System.out.println( s +", ");
        }

    }
}
