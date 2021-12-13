package ru.mirea.exercise9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private ArrayList<Employee> employees = new ArrayList();
    private int salaryAmount = 0; // Сколько компания потратила на сотрудников
    public Company() {
    }
    //найм одного сотрудника
    public void hire(String JobTitle, String firstName, String surName) {
        employees.add(new Employee(JobTitle));

    }
    //найм списка сотрудников
    public void hireAll(int count, String JobTitle) {
        for (int i = 0; i < count; ++i)
            this.employees.add(new Employee(JobTitle));
    }
    //увольнение сотрудника
    public void fire(double fraction) {
        int countKickEmployee = (int) (employees.size() * fraction);
        for (int i = 1; i < countKickEmployee; ++i)
            this.employees.remove((int) (Math.random() * employees.size())); // Рандомно удаляет раб-ов из общего списка
    }
    //получение значения дохода компании
    public int getIncome() {
        for (Employee var : this.employees) {
            salaryAmount += var.getSalary();
        }
        return (int) (Math.random() * 20000000 + 20000000 - salaryAmount);

    }
    // два метода внизу возращают список указанной длины count
    // получить персонал с высокой зарплатой
    public List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> topSalaryStaff = new ArrayList<>();
        topSalaryStaff.addAll(employees);
        Collections.sort(topSalaryStaff, new ComparatorSalary());

        topSalaryStaff.removeAll(topSalaryStaff.subList(0, topSalaryStaff.size() - count)); //"вырезаем" лишние из массива
        return topSalaryStaff;
    }
    // получить персонал с низкой зарплатой
    public List<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> lowestSalaryStaff = new ArrayList<>();
        lowestSalaryStaff.addAll(employees);
        Collections.sort(lowestSalaryStaff, new ComparatorSalary());

        lowestSalaryStaff.removeAll(lowestSalaryStaff.subList(count, lowestSalaryStaff.size()));
        return lowestSalaryStaff;
    }
}
