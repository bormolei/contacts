package contacts.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletListener implements ServletContextListener {

    @Override
    public void contextInitialized (ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed (ServletContextEvent sce) {

    }
}