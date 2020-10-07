package com.ashwin.java.springbootbeandemo.domain.model;

public class Square {
    public int length;

    public void draw() {
        System.out.println("Square: length: " + length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
