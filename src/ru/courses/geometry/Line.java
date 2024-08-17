package ru.courses.geometry;

public class Line implements LengthAble {
    Point start, finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public double getLength() {
        double sum, len1, len2;
        sum = 0;
        len1 = start.x - finish.x;
        len2 = start.y - finish.y;
        sum = Math.sqrt(len1 * len1 + len2 * len2);

        return sum;
    }
}
