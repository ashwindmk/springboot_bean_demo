package com.ashwin.java.springbootbeandemo.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Sphere {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Draw: sphere | A (x: " + center.getX() + ", y: " + center.getY() + ")");
    }
}
