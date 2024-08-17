package ru.courses.geometry;

public class Fraction extends Number {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return "Fraction{"  + num + "/" +
                 denum +'}';
    }

    @Override
    public int intValue() {
        return (int) num / denum;
    }

    @Override
    public long longValue() {
        return (long) num / denum;
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }
}
