package com.ashwin.java.springbootbeandemo.domain.model;

public class Line {
    private Point a;
    private Point b;

    // Bean refs set using <idref bean="">
    private String refA;
    private String refB;

    public Line() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void draw() {
        System.out.println("Draw: line | A (x: " + a.getX() + ", y: " + a.getY() + ") | B (x: " + b.getX() + ", y: " + b.getY() + ")");
    }
}
