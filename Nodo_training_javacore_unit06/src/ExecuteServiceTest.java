import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class ExecuteServiceTest {
    public static void main(String[] args) {
        PrintNumber number = new PrintNumber();
        Callable<Object> value = Executors.callable(number);
        System.out.println("say hello ");
        try {
            value.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("say gb");
    }
}
