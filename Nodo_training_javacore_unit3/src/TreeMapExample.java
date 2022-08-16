import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<Integer,String>();
        map.put(3,"Doan Thanh Tu3");
        map.put(1,"Doan Thanh Tu1");
        map.put(2,"Doan Thanh Tu2");
        map.put(4,"Doan Thanh Tu4");
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry =iterator.next();
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
