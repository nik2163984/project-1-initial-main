package com.csc205.project1;

class Point {                                   //Declaring Variables
    double x;
    double y;

    public Point() {                            //Constructor
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {          //Constructor with parameters
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {          //Determines distance between point 1 to point 2
        double newx = this.x - p2.x;
        double newy = this.y - p2.y;
        double xx = newx * newx;
        double yy = newy * newy;
        return Math.sqrt(xx + yy);
    }

    public double getX() {                      //Gets x variable
        return x;
    }

    public void setX(double x) {                //Sets x variable
        this.x = x;
    }

    public double getY() {                      //Gets y variable
        return y;
    }

    public void setY(double y) {                //Sets y variable
        this.y = y;
    }

    public void setPoint(double x, double y) {  //Sets x and y variable
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {              //Shift x by n amount
        this.x = x + n;
    }

    public void shiftY(double n) {              //Shift y by n amount
        this.y = y + n;
    }

    public void rotate(double angle) {          //Rotates x and y values by angle amount
        double sx = this.x;
        double sy = this.y;
        this.x = (sx * Math.cos(angle)) - (sy * Math.sin(angle));
        this.y = (sx * Math.sin(angle)) + (sy * Math.cos(angle));
    }

    public String toString() {                  //Outputs point on the axis
        return "(" + x + ", " + y + ")";
    }
}