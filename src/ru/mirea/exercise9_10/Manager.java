package ru.mirea.exercise9_10;

public class Manager implements EmployeePosition {
    private int salary = (int) (Math.random() * 100000 + 50000);

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
