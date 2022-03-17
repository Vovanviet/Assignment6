package com.java.assignment6.exercise1;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea() {
        return this.length* this.width;
    }

    @Override
    public String toString() {
        System.out.println("Rectangle of Area:"+getArea());
        return null;
    }
}
