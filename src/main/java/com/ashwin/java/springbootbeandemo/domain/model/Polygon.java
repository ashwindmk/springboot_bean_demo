package com.ashwin.java.springbootbeandemo.domain.model;

import java.util.List;

public class Polygon {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        StringBuilder sb = new StringBuilder("Draw: polygon");
        char c = 'A';
        for (Point p : points) {
            sb.append(" | ").append(c)
                    .append(" (x: ").append(p.getX())
                    .append(", y: ").append(p.getY())
                    .append(")");
            c++;
        }
        System.out.println(sb);
    }
}
