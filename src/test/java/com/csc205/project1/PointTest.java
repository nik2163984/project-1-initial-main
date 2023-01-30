package com.csc205.project1;

import static org.testng.Assert.*;

public class PointTest {

    @org.testng.annotations.Test
    public void testDistance() {
        double expected = 3.0;
        Point a = new Point(2.0, 4.0);
        Point b = new Point(2.0, 1.0);
        double actual = a.distance(b);
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testShiftX() {
        double expected = 9.6;
        Point a = new Point (5.0, 12.12);
        a.shiftX(4.6);
        assertEquals(expected, a.getX());
    }

    @org.testng.annotations.Test
    public void testShiftY() {
        double expected = 4.2;
        Point a = new Point (12.12, 5.0);
        a.shiftY(-0.8);
        assertEquals(expected, a.getY());
    }

    @org.testng.annotations.Test
    public void testRotate() {
        double expectedX = -2.0000000000000004;
        double expectedY = -5.0;
        //Point expected = new Point (-2.0, -5.0);
        Point a = new Point (2.0,5.0);
        a.rotate(Math.PI);
        assertEquals(expectedX, a.getX());
        assertEquals(expectedY, a.getY());
    }
}