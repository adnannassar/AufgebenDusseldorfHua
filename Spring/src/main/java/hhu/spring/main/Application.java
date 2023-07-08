package hhu.spring.main;

import hhu.spring.beans.Car;
import hhu.spring.config.ProjectConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Car c = applicationContext.getBean(Car.class);
        System.out.println("Car " + c.getName() + " was created within Spring Context!");

    }
}
