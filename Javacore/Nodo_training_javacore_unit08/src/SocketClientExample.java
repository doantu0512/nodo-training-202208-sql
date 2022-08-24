import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClientExample {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8080);
        System.out.println("Client start sending...");
        try(DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream())){
            outputStream.writeUTF("Heloo Server");
            System.out.println("server say : " + inputStream.readUTF());
        } finally {
            socket.close();
        }
    }
}
