package ru.mirea.exercise9_10;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    // Доделать имена и фамилию потом
    private String firstname;
    private String surname;
    private int salary;
    private String JobTitle;

    public Employee(String JobTitle) {
        this.JobTitle = JobTitle;
        setJobTittle();
        setFirstnameAndSurname();
    }

    public Employee(String firstname, String surname, String jobTitle) {
        this.firstname = firstname;
        this.surname = surname;
        this.JobTitle = jobTitle;
        setJobTittle();
    }

    private void setFirstnameAndSurname() {
        String[] firstNames = new String[]{"Aaron", "James", "John", "David", "Mark", "Steven", "Kevin", "Larry",
                "Eric", "Joshua", "Henry", "Samuel", "Harry", "Eugene", "Jimmy", "Antonio"};
        String[] surNames = new String[]{"Adams", "Aldridge", "Alexander", "Alix", "Barrett", "Bee", "Benson",
                "Brown", "Jackson", "Grant", "Harris", "Mitchell", "Toni", "Wilson", "Campbell", "Carson"};
        // Рандомно выбирает имя и фамилию для работника
        this.firstname = firstNames[(int)(Math.random() * 15)];
        this.surname = surNames[(int)(Math.random() * 15)];
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private void setJobTittle() {
        switch (JobTitle) {
            case "Operator":
                Operator operator = new Operator();
                this.salary = operator.getSalary();
                break;
            case "Manager":
                Manager manager = new Manager();
                this.salary = manager.getSalary();
                break;
            case "TopManager":
                TopManager topManager = new TopManager();
                this.salary = topManager.getSalary();
                break;
            default:
                System.out.println("Возникла ошибка >_<");
                break;
        }
    }

    public int getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return JobTitle;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "firstname='" + firstname + '\'' +
//                ", surname='" + surname + '\'' +
//                ", salary=" + salary +
//                ", JobTitle='" + JobTitle + '\'' +
//                "}\n";
//    }
}
