package com.ObjectClass;

public class Shape {
    private int sides;
    private String name;

    public Shape(int sides, String name) {
        this.name = name;
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "sides " + sides + "name of shape" + name;
    }

    @Override
    public int hashCode() {
        return sides;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Shape) {
            Shape shape = (Shape) obj;
            if (this.name.equals(shape.name) && this.sides==shape.sides) {
                return true;
            }
        }
        return false;
    }
}
