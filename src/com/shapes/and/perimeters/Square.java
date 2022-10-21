package com.shapes.and.perimeters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Square extends Shape{


    public Square(String color) {
        super(color);
    }

    public double getArea(double a, double b){
        return (a * a);
    }

    public double getPerimeter(double a, double b){
        return (a * 2) +( b * 2);
    }





}
