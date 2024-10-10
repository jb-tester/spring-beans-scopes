package com.mytests.spring.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AnnotationConfigApplicationContext ctx) {

        return args -> {
            System.out.println("myService bean scope: "
                               + ctx.getBeanFactory().getBeanDefinition("myService").getScope());
            System.out.println("protoCompo bean scope: "
                               + ctx.getBeanFactory().getBeanDefinition("protoCompo").getScope());

        };
    }
}
