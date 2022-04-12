package com.enigma.bean;

public class Car{
    private String carName;
    private Engine engine;

    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public Car() {
    }

    public Car(String carName) {
        this.carName = carName;
    }

//    public Car(String carName, String engine) {
//    }

    public void start(){
        System.out.println("Car's name: "+this.carName);
        System.out.print("Car's Engine: ");
        engine.soundEngine();
    }

    public String getCarName() {
        return carName;
    }

    //setter injection
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + carName + '\'' +
                ", engine=" + engine +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Car{" +
//                "name='" + name + '\'' +
//                ", engine=" + engine +
//                '}';
//    }
}

