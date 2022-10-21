package com.shapes.and.perimeters;

public abstract class Shape {

  String color;

  public Shape (String color){
    this.color = color;
  }


abstract double getArea(double a, double b);

abstract double getPerimeter(double c, double d);

public String getColor(){
  return color;
}


}
