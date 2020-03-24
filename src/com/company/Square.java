package com.company;

public class Square extends GeometricFigure {

    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return this.sideLength*this.sideLength;

    }
}
