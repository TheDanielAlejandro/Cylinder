package com.company;

public class Circle {                                                                                                   // . Creating the class "Circle".

    private double radius;                                                                                              // . Initializing the instance variable "radius".


    // CONSTRUCTOR

    public Circle(double radius){                                                                                       // . Constructor with only one parameter.
        if(radius < 0){                                                                                                 // . if the value is < 0, set the value to 0.
            radius = 0;
        }
        this.radius = radius;
    }


    // GET METHODS

    public double getRadius() {                                                                                         // . Get method for the radius instance.
        return radius;
    }

    public double getArea() {                                                                                           // . Get method that calculates the area of the circle.
        return (radius * radius * Math.PI);                                                                             // . Formula Area (radius * radius * PI).
    }

}
