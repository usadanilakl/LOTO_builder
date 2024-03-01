package com.loto_builder.executor;

import java.awt.*;
import java.util.concurrent.TimeoutException;

public class CoordinateFinder {
    public static void main(String[] args) throws Exception{
        Thread.sleep(5000);
        Point location = MouseInfo.getPointerInfo().getLocation();
        double x = location.getX();
        double y = location.getY();
        System.out.println("Current mouse coordinates: X = " + x + ", Y = " + y);
    }
}
