package com.ashwin.java.springbootbeandemo.domain.model;

public class Circle {
    private Color redColor;

    public Color getRedColor() {
        return redColor;
    }

    public void setRedColor(Color color) {
        this.redColor = color;
    }

    public void draw() {
        System.out.println("Draw: circle | color: " + redColor);
    }
}
