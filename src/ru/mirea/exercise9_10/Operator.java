package ru.mirea.exercise9_10;

public class Operator implements EmployeePosition {
    private int salary = (int) (Math.random() * 40000);

    @Override
    public String getJobTitle() {
        return null;
    }

    @Override
    public double calcSalary() {
        return 0;
    }

    public int getSalary() {
        return salary;
    }
}
