package com.company;
//Class to be specific about the operations done on a circle
public class Circle extends Main{
    double pi = 3.142;
    //Calculate and return area of circle
    public double getArea() { return 2 * pi * getRadius() * getRadius();  }
    public double getPerimeter(){ return ( 2 * pi * getRadius() * 2);  }
}
