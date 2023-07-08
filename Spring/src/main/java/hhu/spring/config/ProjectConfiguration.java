package hhu.spring.config;


import hhu.spring.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Bean("bwm")
    Car car1() {
        Car c = new Car();
        c.setName("BWM");
        return c;
    }

    @Bean(name = "audi")
    Car car2() {
        Car c = new Car();
        c.setName("Adui");
        return c;
    }

    @Primary
    @Bean(value = "mercedes")
    Car car3() {
        Car c = new Car();
        c.setName("Mercedes");
        return c;
    }

}
