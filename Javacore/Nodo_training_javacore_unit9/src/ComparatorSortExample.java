import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSortExample {
    public static void main(String[] args) {
        vd2();
    }
    public static void vd1(){
        Integer[] values = {12,345,34,7,9,12,9};

        Arrays.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer ele: values) {
            System.out.println(ele+",");
        }

    }
    public static void vd2(){
        Integer[] values = {12,345,34,7,9,12,9};
        Arrays.sort(values,(Integer o1, Integer o2)-> {
            return o2 - o1;
        });
        for (Integer ele: values) {
            System.out.println(ele+",");
        }
    }
}
