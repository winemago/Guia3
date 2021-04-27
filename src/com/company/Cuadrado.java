package com.company;

public class Cuadrado extends Rectangulo{

    public Cuadrado() {
    }

    public Cuadrado(double width, double heigth) {
        super(width, heigth);
    }

    public Cuadrado(String color, double width, double heigth) {
        super(color, width, heigth);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimetro() {
        return super.perimetro();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

