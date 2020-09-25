package com.ashwin.java.springbootbeandemo.domain.model;

import com.ashwin.java.springbootbeandemo.domain.repository.Animal;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {
    @Override
    public String voice() {
        return "woof";
    }
}
