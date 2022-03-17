package com.java.assignment6.exercise1;

public class Triangle extends Shape {
    private int base;
    private int height;
    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }

    @Override
    public double getArea() {
        return this.base* this.height;
    }

    @Override
    public String toString() {
        System.out.println("Triangle of Area: "+getArea());
        return null;
    }
}
