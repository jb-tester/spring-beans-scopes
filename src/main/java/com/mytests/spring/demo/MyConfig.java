package com.mytests.spring.demo;

import com.mytests.spring.demo.beans.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mytests.spring.demo.beans.Bean1;
import org.springframework.context.annotation.Scope;


@Configuration
public class MyConfig {
    @Bean @Scope("prototype")
    public Bean1 mybean1() {
        return new Bean1("mybean1");
    }

    @Bean @Scope("singleton")
    public Bean2 mybean2() {
        return new Bean2("mybean2");
    }
}
