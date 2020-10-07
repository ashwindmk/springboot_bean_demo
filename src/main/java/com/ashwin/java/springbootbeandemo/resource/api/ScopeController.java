package com.ashwin.java.springbootbeandemo.resource.api;

import com.ashwin.java.springbootbeandemo.domain.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/scope")
public class ScopeController {
    @Autowired(required = true)
    private SingletonService singletonService;

    @GetMapping
    @RequestMapping("/singleton")
    public List<String> singleton() {
        String dt0 = singletonService.getDateTime();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String dt1 = singletonService.getDateTime();
        List<String> list = Arrays.asList(dt0, dt1);
        System.out.println(list);
        return list;
    }

    @GetMapping
    @RequestMapping("/prototype")
    public List<String> prototype(@RequestParam(name = "time") Optional<Boolean> time) {
        System.out.println("time orElse: " + time.orElse(false));
        //System.out.println("time orElse: " + time.orElse(false));
        if (time.orElse(false)) {
            System.out.println("time is true :)");
        } else {
            System.out.println("time is false :(");
        }

        String dt0 = singletonService.getDateTime();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String dt1 = singletonService.getDateTime();
        List<String> list = Arrays.asList(dt0, dt1);
        System.out.println(list);
        return list;
    }
}
