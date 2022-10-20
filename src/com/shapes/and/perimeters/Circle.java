package com.shapes.and.perimeters;

public class Circle extends  Shape{

    @Override
    double getArea(double p, double r) {
        return (Math.sqrt(p * r));
    }

    @Override
    double getPerimeter(double p, double r) {
        return (2 * p * r);
    }
}
