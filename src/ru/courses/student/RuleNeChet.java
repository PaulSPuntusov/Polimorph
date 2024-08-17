package ru.courses.student;

public class RuleNeChet implements Rule{
    @Override
    public boolean check(int x) {
        return x%2==1;
    }
}
