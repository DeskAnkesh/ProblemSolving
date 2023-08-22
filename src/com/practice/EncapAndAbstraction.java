package com.practice;

abstract class Shape{
    private String color;

    public Shape(String color) {
        this.color= color;
    }

    public abstract double calculateArea();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class rectangle extends Shape {

    private double length;
    private double width;

    public rectangle(double l, double w, String color){
        super(color);
        this.length = l;
        this.width = w;

    }
    @Override
    public double calculateArea() {
        return length*width;
    }
}

public class EncapAndAbstraction {
    public static void main(String[] args){

        Shape s = new rectangle(2.5, 3.5, "Red");

        System.out.println(s.calculateArea() + s.getColor());

        s.setColor("Green");

        System.out.println(s.getColor());

    }
}
