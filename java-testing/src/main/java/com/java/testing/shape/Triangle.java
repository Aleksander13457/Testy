package com.java.testing.shape;

public class Triangle implements Shape {
    double side;
    double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (side * height) * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
