public class Square extends Figure implements AreaAble{

    public Square(Point point, Double length) {
        super(point, length);
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
