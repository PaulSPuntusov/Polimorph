public class Point3D extends Point {
    int z;
    Point point;

    public Point3D(Point point, int z) {
        super(point.x, point.y);
        this.x = point.x;
        this.y = point.y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + point.x +
                ", y=" + point.y +
                ", z=" + z +
                '}';
    }
}
