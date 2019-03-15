package com.java.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> list = new ArrayList<>();

    void addFigure(Shape shape) {
        list.add(shape);
    }

    void removeFigure(Shape shape) {
        list.remove(shape);
    }

    String showFigures(Shape shape) {
        return shape.toString();
    }

    Shape getFigure(int n) {
        return list.get(n);
    }

    int getSize() {
        return list.size();
    }

}
