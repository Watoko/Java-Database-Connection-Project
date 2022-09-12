package com.company;
//Class to be specific about the operations done on a rectangle
public class Rectangle extends Main {
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
    public double getPerimeter(){ return ( (getHeight() + getWidth() ) * 2);  }
}

