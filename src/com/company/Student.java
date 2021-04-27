package com.company;

public class Student extends Person{
    private String entry_date;
    private double fee;
    private String career;

    public Student(int dni, String name, String lastname, String email, String direccion, String entry_date, double fee, String career) {
        super(dni, name, lastname, email, direccion);
        this.entry_date = entry_date;
        this.fee = fee;
        this.career = career;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "entry_date=" + entry_date +
                ", fee=" + fee +
                ", career='" + career + '\'' +
                '}';
    }
}
