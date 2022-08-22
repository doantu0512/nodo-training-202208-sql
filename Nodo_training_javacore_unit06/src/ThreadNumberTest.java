import java.util.concurrent.TimeUnit;

public class ThreadNumberTest {
    public static void main(String[] args) {
        PrintNumber number = new PrintNumber();
        Thread thread1 = new Thread(number);
        thread1.setName("FSoft_Thread 1");
        thread1.start();

        Thread thread2 = new Thread(number);
        thread2.setName("FSoft_Thread 2");
        thread2.start();

        while (thread1.isAlive()){
            if (number.getNumber()%10==0) number.setAlive(false);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            break;
        }
    }
}

