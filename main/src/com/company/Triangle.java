package com.company;
//Class to be specific about the operations done on a triangle
public class Triangle extends Main{
    //Calculate and return area and perimeter of triangle
    public double getArea() { return (getHeight() * getWidth()) / 2;  }
    public double getPerimeter() { return ((getHeight() + getHeight())/getWidth());  }
}