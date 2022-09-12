package com.company;

//Class to be specific about the operations done on a square
public class Square extends Main{
    //Calculate and return area of square
    public double getArea()
    {
        return getWidth() * getWidth();
    }
    public double getPerimeter(){ return ( getWidth() * 4);  }
}
