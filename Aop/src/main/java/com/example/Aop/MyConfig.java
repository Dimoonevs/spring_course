package com.example.Aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.Aop")
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class MyConfig {
}
