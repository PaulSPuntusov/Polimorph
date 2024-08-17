package ru.courses.geometry;

public class SumAllAreas {
    Figure[] figures;

    public SumAllAreas(Figure... figures) {
        this.figures = figures;
    }

    public double sumAllAreas(Figure...figures){
        double sum = 0;
        for(Figure f:figures){
            sum += f.getArea();
        }
        return sum;
    }
}
