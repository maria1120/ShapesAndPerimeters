package com.shapes.and.perimeters;

public class Rectangle extends Shape{



    public double getArea(double a, double b){
        return (a * a);
    }

    public double getPerimeter(double a, double b){
        return (a * 2) +( b * 2);
    }


}
