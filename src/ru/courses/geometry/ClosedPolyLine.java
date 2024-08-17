public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points);
    }

    public double getLength() {
        double sum, len1, len2;
        sum = super.getLength();
        len1 = points[0].x - points[points.length - 1].x;
        len2 = points[0].y - points[points.length - 1].y;
        sum += Math.sqrt(len1 * len1 + len2 * len2);

        return sum;
    }
}
