package com.example.demo;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        /**
         *    provide alien bean at runtime
         *     i.e Inject Alien class at run time
         */
        Alien alien = context.getBean(Alien.class);
        alien.initAlien();


    }

}
