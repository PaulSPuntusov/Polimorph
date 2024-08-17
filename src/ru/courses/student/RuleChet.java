package ru.courses.student;

public class RuleChet implements Rule{

    @Override
    public boolean check(int x) {
        return x%2==0;
    }
}
