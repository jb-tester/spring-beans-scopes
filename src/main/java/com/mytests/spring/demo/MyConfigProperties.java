package com.mytests.spring.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "custom.config")
class MyConfigProperties {

}
