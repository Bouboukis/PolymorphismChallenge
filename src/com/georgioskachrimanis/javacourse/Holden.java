package com.georgioskachrimanis.javacourse;

class Holden extends Car{


    // Constructors
    public Holden(int cylinders, String name) {
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
