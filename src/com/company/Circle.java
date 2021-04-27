package com.company;

public class Circle {
    private double ratio = 1.0;
    private String color = "rojo";

    public Circle() {}

    public Circle(double ratio, String color) {
        this.ratio = ratio;
        this.color = color;
    }

    public double area() {
        return Math.PI* Math.pow(ratio, 2);
    }

    @Override
    public String toString() {
        return "circle{" +
                "ratio=" + ratio +
                ", color='" + color + '\'' +
                '}';
    }
}
