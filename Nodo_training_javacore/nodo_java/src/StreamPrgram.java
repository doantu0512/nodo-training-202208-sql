import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamPrgram {
    public static void main(String[] args) {
        System.out.println("The number of arguments is" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(" Value at " + i + "is" + args[i]);

        }
        Arrays.stream(args).forEach((String value) -> {
            System.out.println("Value is" +value);
        });
    }
}
