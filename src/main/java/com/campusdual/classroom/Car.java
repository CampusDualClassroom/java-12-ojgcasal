package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }
    public void start() {

        if (isTachometerEqualToZero()) {

            this.tachometer = 1000;

            System.out.println("Vehículo acendido");

        } else {

            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {

        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Debe detener el vehículo antes de apagarlo.");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            System.out.println("Acelerando, velocidad actual: " + this.speedometer + " km/h.");
        } else {
            System.out.println("No se puede superar la velocidad máxima de " + MAX_SPEED + " km/h.");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            System.out.println("Frenando, velocidad actual: " + this.speedometer + " km/h.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle >= -45 && angle <= 45) {
            this.wheelsAngle = angle;
            System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + " grados.");
        } else if (angle < 0) {
            this.wheelsAngle = -45;
            System.out.println("No se puede girar menos de -45 grados.");
        } else {
            this.wheelsAngle = 45;
            System.out.println("No se puede girar más de 45 grados.");
        }
    }
    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {

            this.reverse = reverse;

            if (reverse) {
                this.gear = "R";
                System.out.println("Marcha establecida en: atrás");
            } else {
                this.gear = "N";
                System.out.println("Marcha establecida en: neutral");
            }
        } else {

            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento.");
        }
    }
}