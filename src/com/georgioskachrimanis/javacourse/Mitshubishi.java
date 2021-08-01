package com.georgioskachrimanis.javacourse;

class Mitsubishi extends Car{


    // Constructors
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    // Methods
    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
