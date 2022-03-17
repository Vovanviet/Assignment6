package com.java.assignment6.exercise2;

public class MovablePoint implements IMovable{
    private int x;
    private int y;
public MovablePoint(int x,int y){
    this.x=x;
    this.y=y;
}
    @Override
    public void moveUp() {
        x++;
        System.out.println("X:"+x+"Y:"+y);
    }

    @Override
    public void moveDown() {
        x--;
        System.out.println("X:"+x+"Y:"+y);

    }

    @Override
    public void moveLeft() {
        y--;
        System.out.println("X:"+x+"Y:"+y);

    }

    @Override
    public void moveRight() {
        y++;
        System.out.println("X:"+x+"Y:"+y);

    }
}
