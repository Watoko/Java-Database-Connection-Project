package com.company;
//Class to publicly gain the different measurements needed
public class Main {

    private double height;  // To hold height.
    private double width;  //To hold width or base
    private double radius; //To hold radius

    // Set height, width and radius
    public void setValues(double height, double width, double radius)
    {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    //Get height
    public double getHeight()
    {
        return height;
    }

    //Get width
    public double getWidth()
    {
        return width;
    }

    //Get radius
    public double getRadius()
    {
        return radius;
    }
}