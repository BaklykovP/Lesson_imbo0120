package ru.mirea.exercise9_10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company microsoft = new Company();
        microsoft.hireAll(180, "Operator");
        microsoft.hireAll(80, "Manager");
        microsoft.hireAll(10, "TopManager");

        System.out.printf("Before: %d \n", microsoft.getIncome()); // Доход компании до увальнения

        getList(microsoft.getTopSalaryStaff(10));
        System.out.println("--------------------------");
        getList(microsoft.getLowestSalaryStaff(30));
        microsoft.fire(0.6);

        System.out.printf("\n After the kick \n\n");

        getList(microsoft.getTopSalaryStaff(10));
        System.out.println("--------------------------");
        getList(microsoft.getLowestSalaryStaff(30));

        System.out.printf("After: %d", microsoft.getIncome()); // Доход компании после увальнения
    }

    public static void getList(List<Employee> list) {
        for (int i = list.size() - 1; i >= 0; --i) {
            System.out.println(i + 1 + "-" + list.get(i).getSalary());
        }
    }

}
