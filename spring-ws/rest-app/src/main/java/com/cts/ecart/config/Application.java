package com.cts.ecart.config;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Application {

    public static void main(String[] args) throws Exception {
    	System.out.println(">>>>>> main <<<<<<");
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class); // replace AppConfig with your @Configuration class

        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

        ServletHolder servletHolder = new ServletHolder("dispatcher", dispatcherServlet);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");
        handler.addServlet(servletHolder, "/*");

        Server server = new Server(3005); // set the port you want
        server.setHandler(handler);

        server.start();
        server.join();
    }
}
