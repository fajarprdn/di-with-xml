package com.enigma.bean;

public class Diesel implements Engine{
    protected String name;

    public Diesel() {
        this.name = "diesel";
    }

    @Override
    public void soundEngine() {
        System.out.println(name);
        System.out.println("Engine sound : grebet grebet");
    }

    @Override
    public String toString() {
        return "Diesel{" +
                "name='" + name + '\'' +
                '}';
    }
}
