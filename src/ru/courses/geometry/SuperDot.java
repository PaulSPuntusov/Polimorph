package ru.courses.geometry;

import java.util.Arrays;

public class SuperDot {
    Property[] prop;

    public SuperDot(Property... prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "ru.courses.geometry.SuperDot{" +
                "prop=" + Arrays.toString(prop) +
                '}';
    }
}
