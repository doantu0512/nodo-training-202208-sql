
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int read;
            byte[]bytes = new byte[100];
            while((read= stream.read(bytes)) != -1){
                System.out.println(new String(bytes,0,read));
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
