import java.util.concurrent.TimeUnit;

import static java.util.Arrays.stream;

public class PrintMessage implements Runnable{
    private  String message;

    public PrintMessage(String message) {
        this.message = message;
    }

    @Override
    public synchronized void run() {
        String[] elements = message.split("");
        stream(elements).forEach(ele->{
            System.out.println(Thread.currentThread().getName()+"print"+ele);
            try {
                Thread.sleep((int)(Math.random()*3)*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//b2
//            try {
//                Thread.sleep((int)(Math.random()*3)*1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//b1
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        });
    }

    public static void main(String[] args) {
        PrintMessage  message = new PrintMessage("say hehe heho hoho");
        new Thread(message).start();
    }
}
