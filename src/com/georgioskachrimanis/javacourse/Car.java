package com.georgioskachrimanis.javacourse;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructors
    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    // Getters and Setters
    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    // Methods
    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine().";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate().";
    }

    public String brake(){
        return getClass().getSimpleName() + " -> brake()."; // I think is better to use car is decelerating.
    }

}
