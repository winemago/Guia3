package com.company;

public abstract class Figure {
    private String color = "Rojo";

    public Figure() {}

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    }
}



