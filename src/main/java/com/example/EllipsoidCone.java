/*
* File: EllipsoidCone.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/Martin91625/
* Licenc: MIT
*/

package com.example;

public class EllipsoidCone {
    
    public static double calcVolume(double r1, double r2, double height) {
        return (Math.PI * r1 * r2 * height) / 3;
    }
}
