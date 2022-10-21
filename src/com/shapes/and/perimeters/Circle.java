package com.shapes.and.perimeters;

public class Circle extends  Shape{

    public Circle(String color) {
        super(color);
    }

    @Override
    double getArea(double p, double r) {
        return (Math.sqrt(p * r));
    }

    @Override
    double getPerimeter(double p, double r) {
        return (2 * p * r);
    }
}
