package ru.courses.birds;

public class Parrot extends Birds{
    String name, text;

    public Parrot(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public void sing() {
        int textLength = 1+ (int)((Math.random()*(text.length()))-1);
        for( int i = 0; i<textLength;i++){
            System.out.print(text.charAt(i));
        }

    }
}
