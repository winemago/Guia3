package com.company;

public class Staff extends Person{
    private double salary;
    private String turn;

    public Staff(int dni, String name, String lastname, String email, String direccion, double salary, String turn) {
        super(dni, name, lastname, email, direccion);
        this.salary = salary;
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString()+
                "salary=" + salary +
                ", turn='" + turn + '\'' +
                '}';
    }
}
