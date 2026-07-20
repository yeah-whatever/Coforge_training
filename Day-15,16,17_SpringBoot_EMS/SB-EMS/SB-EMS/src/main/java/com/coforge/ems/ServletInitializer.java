package com.coforge.ems;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * ServletInitializer is used when deploying a Spring Boot application
 * as a WAR file on an external servlet container such as:
 * - Apache Tomcat
 * - JBoss
 * - WildFly
 *
 * If you run the application using the embedded Tomcat
 * (by running SbEmsApplication.java), this class is NOT used.
 *
 * Since your project is packaged as a WAR
 * (<packaging>war</packaging> in pom.xml),
 * this class allows the external server to start your application.
 */

public class ServletInitializer extends SpringBootServletInitializer {

    /*
     * configure() is called automatically by the external servlet container
     * when deploying the WAR file.
     *
     * SpringApplicationBuilder is used to build and configure
     * the Spring Boot application.
     *
     * application.sources(SbEmsApplication.class)
     * tells Spring Boot that SbEmsApplication is the
     * main configuration class from where the application should start.
     *
     * This method performs the same job as:
     *
     * SpringApplication.run(SbEmsApplication.class, args);
     *
     * but it is used only for WAR deployment on an external server.
     */

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SbEmsApplication.class);
    }

}