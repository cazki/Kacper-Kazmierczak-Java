package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private final static String name = "Square";
    private double length;

    public Square(double length) {
        this.length = length;
    }
    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        return Math.pow(length, 2);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}