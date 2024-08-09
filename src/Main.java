public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(5,6);
        System.out.println(f.toString());
        System.out.println(f.intValue());
        System.out.println(f.longValue());
        System.out.println(f.floatValue());
        System.out.println(f.doubleValue());

    }
    public static double mainGetLength(LengthAble object){
        double res = 0;
        res = object.getLength();
        return res;
    }
    interface LengthAble {
        double getLength();
    }
}