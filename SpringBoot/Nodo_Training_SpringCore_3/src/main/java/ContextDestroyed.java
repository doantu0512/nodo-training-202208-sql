import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextListener;

public interface ContextDestroyed extends ServletContextListener {
    void ContextDestroyed();

    void ContextInitialized(WebApplicationContext context);
}
