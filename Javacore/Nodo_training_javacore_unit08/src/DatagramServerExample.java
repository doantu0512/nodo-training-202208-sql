import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class DatagramServerExample implements Runnable {
    public static void main(String[] args) {
        new Thread(()->{
             new DatagramServerExample();
        }).start();
    }
    public DatagramServerExample(){
        try {
            DatagramSocket socket = new DatagramSocket(4445);
            System.out.println("data server listening...");
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
            socket.receive(packet);
            System.out.println("From Client"+new String(packet.getData(),0,packet.getLength()));
            System.out.println(bytes+"Server say hello");
        }finally {

        }
    }

}
