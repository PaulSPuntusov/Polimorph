public class Fraction {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num + "/"+
                ", denum=" + denum +
                '}';
    }
}
