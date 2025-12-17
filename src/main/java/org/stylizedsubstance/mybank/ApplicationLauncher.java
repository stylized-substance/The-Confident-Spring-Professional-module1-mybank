package org.stylizedsubstance.mybank;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;


public class ApplicationLauncher {
    static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        int port = Integer.parseInt(System.getProperty("Dserver.port"));
        tomcat.setPort(port);
        tomcat.getConnector();

/*
        Context ctx = tomcat.addContext("", null);
        TODO uncomment once servlet is available
        Wrapper servlet = Tomcat.addServlet(ctx, "myBankServlet", new MyBankServlet());
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/*");
*/

        tomcat.start();
    }
}
