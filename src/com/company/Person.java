package com.company;

public class Person {
    private int dni;
    private String name;
    private String lastname;
    private String email;
    private String direccion;

    public Person(int dni, String name, String lastname, String email, String direccion) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
