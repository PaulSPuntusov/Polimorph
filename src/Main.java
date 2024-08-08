public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,0);
        Point p3 = new Point(1,1);
        Point p4 = new Point(0,1);
        Point[] arr1 = {p1,p2,p3,p4};
        PolyLine pl1 = new PolyLine(arr1);
        ClosedPolyLine cpl1 = new ClosedPolyLine(arr1);
        System.out.println(pl1.length());
        System.out.println(cpl1.closedLength());
    }
}