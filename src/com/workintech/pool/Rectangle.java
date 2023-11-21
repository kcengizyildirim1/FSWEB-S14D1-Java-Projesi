package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = Math.max(0,width);
        this.length = Math.max(0, length);
    }

    public int getWidth(){
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea(){
        return width * length;
    }
}
