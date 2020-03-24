package com.company;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        square.setSideLength(9.5);
        double areaSquare = square.calculateArea();
        System.out.println("AreaSquare = " + areaSquare);

        rectangle.setSideLengthA(2.8);
        rectangle.setSideLengthB(7.3);
        double areaRectangle = rectangle.calculateArea();
        int b = (int) (areaRectangle*100);
        areaRectangle = (double) b/100;
        System.out.println("AreaRectangle = " + areaRectangle);
    }
}
