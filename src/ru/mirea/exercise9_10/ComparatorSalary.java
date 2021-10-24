package ru.mirea.exercise9_10;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
