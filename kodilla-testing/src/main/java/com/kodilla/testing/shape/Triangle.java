package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private final static String name = "Triangle";
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }
    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        if(checkTriangleCondition()){
            double halfOfCircuit = getHalfOfCircuit();
            return heronsPattern(halfOfCircuit);
        } else {
            return 0;
        }
    }
    private boolean checkTriangleCondition(){
        return(lengthA + lengthB > lengthC &&
                lengthA + lengthC > lengthB &&
                lengthB + lengthC > lengthA);
    }
    private double getHalfOfCircuit(){
        return (lengthA + lengthB + lengthC)/2;
    }
    private double heronsPattern(double halfCircuit) {
        return Math.sqrt(halfCircuit*(halfCircuit-lengthA)*(halfCircuit-lengthB)*(halfCircuit-lengthC));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.lengthA, lengthA) == 0 &&
                Double.compare(triangle.lengthB, lengthB) == 0 &&
                Double.compare(triangle.lengthC, lengthC) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(lengthA, lengthB, lengthC);
    }
}

