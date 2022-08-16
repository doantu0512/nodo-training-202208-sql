import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new Hashtable<Integer,String>();
        map.put(3,"Doan Thanh Tu3");
        map.put(1,"Doan Thanh Tu1");
        map.put(2,"Doan Thanh Tu2");
        map.put(4,"Doan Thanh Tu4");
        System.out.println(map.get(3));

//        map.put(3,"Doan Thanh Tu3");
//        System.out.println(map.get(3));
    }
}
