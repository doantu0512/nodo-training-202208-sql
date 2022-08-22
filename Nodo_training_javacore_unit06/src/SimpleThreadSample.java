

import java.util.Arrays;


public class SimpleThreadSample {
    public static void main(String[] args) {
            new Thread(
                ()->{
                    Arrays.stream(args).forEach(ele->{
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(ele);
                    });
                }
        ).start();
        }

}
