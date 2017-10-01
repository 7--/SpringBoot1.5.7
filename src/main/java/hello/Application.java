package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.*;
import org.springframework.boot.web.SpringBootServletInitializer;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}