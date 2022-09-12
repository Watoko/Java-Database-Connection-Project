package com.company;
//Class to demonstrate all methods implemented in the different classes at one point
public class Demo{
    public static void main(String[] args)
    {
        Main shape;

        // assign subclass reference to subclass variable
        Rectangle rect = new Rectangle();

        // shape points to the object rect.
        shape = rect;

        // Set data in Rectangle's object
        shape.setValues(78, 5,0);

        //Display the area of rectangle
        System.out.println("Area of rectangle : " + rect.getArea());

        //Display the perimeter of rectangle
        System.out.println("Perimeter of rectangle : " + rect.getPerimeter());

        // assign subclass reference to subclass variable
        Triangle tri = new Triangle();

        // shape points to the object tri.
        shape = tri;

        // Set data in Triangle's object
        shape.setValues(34,66,0);

        //Display the area of triangle
        System.out.println("Area of triangle : " + tri.getArea());

        //Display the perimeter of triangle
        System.out.println("Perimeter of triangle : " + tri.getPerimeter());

        // assign subclass reference to subclass variable
        Circle cir = new Circle();

        // shape points to the object cir.
        shape = cir;

        // Set data in Circle's object
        shape.setValues(0,0,7);

        //Display the area of circle
        System.out.println("Area of circle : " + cir.getArea());

        //Display the perimeter of circle
        System.out.println("Perimeter of circle : " + cir.getPerimeter());

        // assign subclass reference to subclass variable
        Square squ = new Square();

        // shape points to the object squ.
        shape = squ;

        // Set data in Square's object
        shape.setValues(0,35,0);

        //Display the area of square
        System.out.println("Area of square : " + squ.getArea());

        //Display the perimeter of square
        System.out.println("Perimeter of square : " + squ.getPerimeter());
    }
}
