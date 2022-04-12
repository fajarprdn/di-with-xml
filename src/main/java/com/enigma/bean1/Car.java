package com.enigma.bean1;

import com.enigma.bean.Engine;

public class Car {
    private String name;
    private Engine engine;

    //constructor injection
    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public void run(){
    }
}
