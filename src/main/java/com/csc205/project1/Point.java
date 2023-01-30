package com.csc205.project1;

class Point {
    double x;
    double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        double newx = this.x - p2.x;
        double newy = this.y - p2.y;
        double xx = newx * newx;
        double yy = newy * newy;
        return Math.sqrt(xx + yy);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.x = x + n;
    }

    public void shiftY(double n) {
        this.y = y + n;
    }

    public void rotate(double angle) {
        double sx = this.x;
        double sy = this.y;
        this.x = (sx * Math.cos(angle)) - (sy * Math.sin(angle));
        this.y = (sx * Math.sin(angle)) + (sy * Math.cos(angle));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}