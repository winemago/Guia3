package com.company;

public class Cylinder extends Circle{
    private double heigth = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double ratio, String color, double heigth) {
        super(ratio, color);
        this.heigth = heigth;
    }

    public double volume(){
        return super.area() * heigth;
    }

    @Override
    public double area() {
        return ((2 * Math.PI) * this.heigth + (2 * super.area()));
    }

    public Cylinder(double ratio, String color) {
        super(ratio, color);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "heigth=" + heigth +
                '}';
    }
}
