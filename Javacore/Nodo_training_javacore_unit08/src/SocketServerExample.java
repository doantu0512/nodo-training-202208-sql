import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {
    public SocketServerExample(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("server listening...");
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(()->{
                try(DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                    DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream())){
                    System.out.println("Client say: "+inputStream.readUTF());
                    outputStream.writeUTF("i'm a socket server!");
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }
    }
    public static void main(String[] args) throws IOException {
        SocketServerExample sse = new SocketServerExample(8080);
    }
}