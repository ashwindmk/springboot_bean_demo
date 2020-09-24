package com.ashwin.java.springbootbeandemo.domain.model;

public class Triangle {
    private String type;
    private double height;
    private double base;
    private String color;

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, double height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type, double height, double base) {
        this.type = type;
        this.height = height;
        this.base = base;
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Draw: triangle | color: " + color + " | type: " + type + " | height: " + height + " | base: " + base);
    }
}
