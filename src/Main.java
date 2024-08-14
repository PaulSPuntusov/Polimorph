public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 2), 5.);
        Circle c2 = new Circle(new Point(8,9),8.);
        Square s1 = new Square(new Point(3, 4), 6.);
        Rectangle r1 = new Rectangle(new Point(7,8),3.,4.);
        //System.out.println(mainGetArea(c1));
        //System.out.println(mainGetArea(s1));
        //System.out.println(mainGetArea(r1));
        Rectangle r2 = new Rectangle(new Point(8,9),5.,8.);
        Rectangle r3 = new Rectangle(new Point(1,1),6.,7.);
        SumAllAreas m1 = new SumAllAreas(c1,c2,s1,r1,r2,r3);
        System.out.println(sumAllAreas(c1,c2,s1,r1,r2,r3));
        System.out.println(anotherSumAllAreas(c1,c2,s1,r1,r2,r3));
        System.out.println(m1.sumAllAreas(c1,c2,s1,r1,r2,r3));
    }
    public static double sumAllAreas(Figure...figures){
        double sum = 0;
        for(Figure f:figures){
            sum += f.getArea();
        }
        return sum;
    }
    public static double anotherSumAllAreas(Figure...figures){
        double sum = 0;
        for(Figure f:figures){
            sum += mainGetArea(f);
        }
        return sum;
    }


    public static double mainGetArea(AreaAble object) {
        return object.getArea();
    }

    public static double sum(Number... nums) {
        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i].doubleValue();
        }
        return res;
    }

    public static double mainGetLength(LengthAble object) {
        double res = 0;
        res = object.getLength();
        return res;
    }

    public static void letsSing(SingAble object) {
        object.sing();
    }

}