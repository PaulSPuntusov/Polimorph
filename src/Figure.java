public abstract class Figure implements AreaAble {
    Point point;
    Double length;

    public Figure(Point point, Double length) {
        this.point = point;
        this.length = length;
    }

    public abstract double getArea();
}
