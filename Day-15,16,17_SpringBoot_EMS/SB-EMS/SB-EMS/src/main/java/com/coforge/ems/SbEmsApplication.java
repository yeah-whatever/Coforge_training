package com.coforge.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This is the main class of the Spring Boot application.
 * Execution starts from the main() method.
 */

 /*
  * @SpringBootApplication is a shortcut annotation that combines:
  *
  * 1. @Configuration
  *    - Marks this class as a configuration class.
  *    - Spring treats it as a source of bean definitions.
  *    - Bean objects are created and managed by the Spring IoC Container.
  *
  * 2. @EnableAutoConfiguration
  *    - Automatically configures Spring Boot based on the dependencies
  *      present in pom.xml and the properties defined in application.properties.
  *    - Example:
  *        • If spring-boot-starter-web is present, Spring configures Tomcat.
  *        • If spring-boot-starter-data-jpa is present, Spring configures JPA/Hibernate.
  *        • If MySQL dependency is present, Spring configures the DataSource.
  *
  * 3. @ComponentScan
  *    - Scans the current package (com.coforge.ems) and all its sub-packages.
  *    - Detects classes annotated with:
  *        @Controller
  *        @RestController
  *        @Service
  *        @Repository
  *        @Component
  *    - Registers them as Spring Beans automatically.
  */

@SpringBootApplication
public class SbEmsApplication {

    /*
     * Main method - Entry point of the application.
     *
     * SpringApplication.run():
     * 1. Starts the Spring Boot application.
     * 2. Creates the Spring IoC Container.
     * 3. Scans and creates all Spring Beans.
     * 4. Performs Auto Configuration.
     * 5. Starts the embedded Tomcat server.
     * 6. Makes the REST APIs available for client requests.
     */

    public static void main(String[] args) {
        SpringApplication.run(SbEmsApplication.class, args);
    }

}