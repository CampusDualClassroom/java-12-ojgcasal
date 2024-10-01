package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
// Crear un objeto Car
        Car myCar = new Car("Peugeot", "308", "Gasolina");

        myCar.start();
        myCar.start();

        myCar.accelerate();
        myCar.accelerate();

        myCar.stop();
        myCar.stop();

        myCar.brake();

        myCar.stop();

        myCar.turnAngleOfWheels(20);

        myCar.turnAngleOfWheels(50);

        myCar.setReverse(true);

        myCar.accelerate();
        myCar.setReverse(true);
    }
}

