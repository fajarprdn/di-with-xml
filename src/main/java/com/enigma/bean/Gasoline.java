package com.enigma.bean;

public class Gasoline implements Engine{

    private String name;

    public Gasoline(){
        this.name = "gasoline engine";
    }

    @Override
    public void soundEngine() {
        System.out.println("Name: "+name);
        System.out.println("Engine sound breeeem");
    }
}
