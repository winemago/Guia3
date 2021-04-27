package com.company;

public class Main {

    public static void main(String[] args) {
        Cylinder cilo = new Cylinder();

        System.out.println(cilo);

        Cylinder cilo2 = new Cylinder(2.0,"blue",10);

        System.out.println(cilo2 + " area base: " + cilo2.area() + " volume: " + cilo2.volume());

    }
}
