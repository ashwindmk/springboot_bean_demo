package com.ashwin.java.springbootbeandemo.resource.api;

import com.ashwin.java.springbootbeandemo.domain.model.Circle;
import com.ashwin.java.springbootbeandemo.domain.model.Line;
import com.ashwin.java.springbootbeandemo.domain.model.Polygon;
import com.ashwin.java.springbootbeandemo.domain.model.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shape")
public class ShapeController {
    private static final String TAG = "Shape";

    @GetMapping
    @RequestMapping("/ping")
    public ResponseEntity<String> ping() {
        String output = "pong";
        System.out.println(TAG + " | " + output);
        return ResponseEntity.ok(output);
    }

    @GetMapping
    @RequestMapping("/triangle")
    public void triangle() {
        //Triangle triangle = new Triangle();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        System.out.println(TAG + " | triangle | " + System.identityHashCode(triangle));
        triangle.draw();
    }

    @GetMapping
    @RequestMapping("/line")
    public void line() {
        //Triangle triangle = new Triangle();  // For noobs :D

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // New beans (instances) are created with every new context
        // All singleton beans are already initialized

        // Get bean by id
        Line lineOne = (Line) context.getBean("line01");
        System.out.println(TAG + " | line-one | id: " + System.identityHashCode(lineOne));
        lineOne.draw();

        // Get bean by name
        Line lineTwo = (Line) context.getBean("line-two");
        System.out.println(TAG + " | line-two | id: " + System.identityHashCode(lineTwo));
        lineTwo.draw();

        Line lineOneCopy = (Line) context.getBean("line01");  // same instance as lineOne
        System.out.println(TAG + " | line-one-copy | id: " + System.identityHashCode(lineOneCopy));
        lineOneCopy.draw();
    }

    @GetMapping
    @RequestMapping("/polygon")
    public void polygon() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Polygon polygon = (Polygon) context.getBean("pentagon");
        polygon.draw();
    }

    @GetMapping
    @RequestMapping("/circle")
    public void circle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Circle circle = (Circle) context.getBean("redCircle");
        circle.draw();
    }
}
