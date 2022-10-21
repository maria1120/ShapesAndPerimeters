package com.shapes.and.perimeters;

public class Triangle extends Shape{


    public Triangle(String color) {
        super(color);
    }

    @Override
    double getArea(double a, double b) {
        return a * b / 2;
    }

    @Override // for isosceles Triangle only
    double getPerimeter(double c, double d) {
        return c + 2 * d;
    }
}
