package ru.mirea.exercise21_22.section1;

public class ComplexNumberFactory implements NumberFactory{
    @Override
    public Number getNumber() {
        return new ComplexNumber();
    }

    @Override
    public SumNumber getSumNumber() {
        return new SumComplexNumber();
    }
}
