public class PrintNumber implements Runnable{
    private Integer number = new Integer(1);
    private boolean alive = true;

    public PrintNumber() {
        this.number = number;
        this.alive = alive;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        synchronized (number){
        while (number<30) {
            number++;
            System.out.println(current.getName() + "Number is " + number);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println(current.getName()+"is stopped");
        }
    }

//    public static void main(String[] args) {
//        PrintMessage  message = new PrintMessage("1 2 3 4 5 6");
//        new Thread(message).start();
//    }
}
