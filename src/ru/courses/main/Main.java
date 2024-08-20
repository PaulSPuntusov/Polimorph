package ru.courses.main;

import ru.courses.birds.SingAble;
import ru.courses.geometry.*;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        String x = args[0];
        String y = args[1];
        System.out.println(localPow(x,y));
    }
    public static double localPow(String xString, String yString){
        return pow((double) parseInt(xString),(double) parseInt(yString));
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