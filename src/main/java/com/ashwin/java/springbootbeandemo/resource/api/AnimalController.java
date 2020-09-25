package com.ashwin.java.springbootbeandemo.resource.api;

import com.ashwin.java.springbootbeandemo.domain.repository.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired(required = false)
    @Qualifier("dog")  // Auto-generated beans are always named in lower-case
    private Animal animal;  // Variable name can be changed to dog to remove qualifier annotation

    @GetMapping
    @RequestMapping("/voice")
    public void voice() {
        System.out.println("Voice: " + animal.voice());
    }
}
