package org.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootCustomStarter {

    @Bean
    public HelloWorld sayHello() {
        return new HelloWorld();
    }
}
