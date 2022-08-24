import java.net.MalformedURLException;
import java.net.URL;

public class UrlExample {
    public static void main(String[] args) {
        String link = "https://www.google.com/search?q=hello";
        URL url;
        try {
            url = new URL(link);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("protocol" + url.getProtocol());
        System.out.println("Port"+ url.getPort());
        System.out.println("Query"+ url.getQuery());
    }
}
