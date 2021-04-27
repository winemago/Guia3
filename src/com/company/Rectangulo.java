package com.company;

public class Rectangulo extends Figure{
    private double width = 1.0;
    private double heigth =1.0;

    public Rectangulo() {
    }

    public Rectangulo(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangulo(String color, double width, double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return width * heigth;
    }

    @Override
    public double perimetro() {
        return 2*(width + heigth);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                super.toString() +
                "width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}
