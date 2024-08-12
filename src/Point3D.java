public class Point3D extends Point{
    int x, y,z;
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
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
