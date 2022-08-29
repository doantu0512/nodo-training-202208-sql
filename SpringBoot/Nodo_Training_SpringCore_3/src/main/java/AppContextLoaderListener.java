import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

public class AppContextLoaderListener extends ContextLoaderListener implements ContextDestroyed {
    @Override
    public void ContextDestroyed() {
        System.out.println("Đã hủy ứng dụng");
    }

    @Override
    public void ContextInitialized(WebApplicationContext context) {
        System.out.println("Đã khởi tạo ứng dụng");
    }
}
