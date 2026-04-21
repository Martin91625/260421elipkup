package com.example;

public class EllipsoidCone {
    
    public static double calcVolume(double r1, double r2, double height) {
        return (Math.PI * r1 * r2 * height) / 3;
    }
}
