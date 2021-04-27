package com.company;

public class Circulo extends Figure{
    private double ratio = 1.0;

    public Circulo() {
    }

    public Circulo(double ratio) {
        this.ratio = ratio;
    }

    public Circulo(String color, double ratio) {
        super(color);
        this.ratio = ratio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(ratio, 2);
    }

    @Override
    public double perimetro() {
        return (2 * Math.PI) * ratio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                super.toString() +
                "ratio=" + ratio +
                '}';
    }
}
