package ru.courses.geometry;

public class Circle extends Figure implements AreaAble{


    public Circle(Point point, Double length) {
        super(point, length);
    }

    @Override
    public double getArea() {
        return length*length*Math.PI;
    }
}
