package org.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootCustomStarter {

    @Bean
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
