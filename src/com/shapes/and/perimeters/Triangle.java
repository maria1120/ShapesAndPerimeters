package com.shapes.and.perimeters;

public class Triangle extends Shape{




    @Override
    double getArea(double a, double b) {
        return a * b / 2;
    }

    @Override // for isosceles Triangle only
    double getPerimeter(double c, double d) {
        return c + 2 * d;
    }
}
