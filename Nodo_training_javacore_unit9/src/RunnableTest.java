import org.omg.CORBA.PUBLIC_MEMBER;

public class RunnableTest {
    public static void main(String[] args) {
        vd1();
    }
    public static void vd1(){
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"say hello");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
    public static void vd2(){
        Runnable runnable=()->{
            System.out.println(Thread.currentThread().getName()+"say hello");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
    public static void vd3(){
        Thread thread = new Thread(
                ()-> System.out.println(Thread.currentThread().getName()+"say hello2")
        );
        thread.start();
    }
    public static void vd4(){
        Thread thread = new Thread(
                ()-> System.out.println(Thread.currentThread().getName()+"say hello3")

        );
        System.out.println("1+1="+(1+1));
        thread.start();
    }
}
