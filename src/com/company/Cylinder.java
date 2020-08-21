package com.company;

public class Cylinder extends Circle {                                                                                  // . Creating a sub class Cylinder.

    private double height;                                                                                              // . The class has ony one instance variable(field).

    // CONSTRUCTOR

    public Cylinder(double radius, double height) {                                                                     // . Constructor with 2 parameters.
        super(radius);                                                                                                  // . Calling the parent constructor.
        if(height < 0){                                                                                                 // . Checking if the value of height is lower than 0, if yes set it to 0.
            height = 0;
        }
        this.height = height;
    }


    // GET METHODS

    public double getHeight(){                                                                                          // . Get method for the height without parameters.
        return height;
    }

    public double getVolume(){                                                                                          // . Get method for the Volume without parameters.
        return (height * (getArea()));                                                                                  // . Formula Volume = (height * Area), To retrieve the area using the method getArea() from the parent class.
    }
}
