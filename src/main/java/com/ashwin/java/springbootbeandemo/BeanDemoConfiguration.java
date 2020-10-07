package com.ashwin.java.springbootbeandemo;

import com.ashwin.java.springbootbeandemo.domain.model.Square;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDemoConfiguration {
    @Bean
    public Square square() {
        return new Square();
    }
}
