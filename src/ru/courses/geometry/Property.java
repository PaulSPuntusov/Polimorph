package ru.courses.geometry;

public class Property {
    String name;
    Object obj;

    public Property(String name, Object obj) {
        this.name = name;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ru.courses.geometry.Property{" +
                "name='" + name + '\'' +
                ", obj=" + obj +
                '}';
    }
}
