public class Main {
    public static void main(String[] args) {
        System.out.println(sum(2,new Fraction(3,5),2.3));
        System.out.println(sum(3.6,new Fraction(49,12),3,new Fraction(3,2)));
        System.out.println(sum(new Fraction(1,3),1));
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

    interface LengthAble {
        double getLength();
    }
}