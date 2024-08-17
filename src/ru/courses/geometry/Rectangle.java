package ru.courses.geometry;

public class Rectangle extends Square implements AreaAble{
    private double width;
    public Rectangle(Point point, Double length, Double width) {
        super(point, length);
        if(width.equals(length)) throw new IllegalArgumentException("создайте квадрат!");
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
