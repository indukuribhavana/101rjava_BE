package com.get_set;

public class Rectangle {

    private int length;
    private int breadth;

    public void setLength(int len) {
        length = len;    
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int brd) {
        breadth = brd; 
    }

    public int getBreadth() {
        return breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public void displayRectangleDetails() {
        System.out.println("Rectangle Details");
        System.out.println("Length     : " + getLength());
        System.out.println("Breadth    : " + getBreadth());
        System.out.println("Area       : " + calculateArea());
        System.out.println("Perimeter  : " + calculatePerimeter());
    }
}