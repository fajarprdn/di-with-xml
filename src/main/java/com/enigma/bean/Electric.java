package com.enigma.bean;

public class Electric implements Engine{
    protected String electricName;

    public Electric(){
        this.electricName = "electric engine";
    }

    public String getElectricName() {
        return electricName;
    }

    public void setElectricName(String electricName) {
        this.electricName = electricName;
    }

    @Override
    public void soundEngine() {
        System.out.println("Name: "+ electricName);
        System.out.println("Engine sound : ngiiing");
    }

    @Override
    public String toString() {
        return "Electric{" +
                "name='" + electricName + '\'' +
                '}';
    }
}
