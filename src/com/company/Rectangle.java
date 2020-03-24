package com.company;

public class Rectangle extends GeometricFigure {

    private double sideLengthA;
    private double sideLengthB;

    public double getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(double sideLengthA) {
        this.sideLengthA = sideLengthA;
    }

    public double getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthB(double sideLengthB) {
        this.sideLengthB = sideLengthB;
    }

    @Override
    public double calculateArea() {
        return this.sideLengthA*this.sideLengthB;

    }
}
