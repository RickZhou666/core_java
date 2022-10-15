package com.rick.util.Emploee;

/**
 * @Author: Rick
 * @Date: 2022/10/14 16:33
 */
public class Employee {
    public String name;
    public int salary;
    public int month;
    public int day;
    public int year;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int salary, int month, int day, int year) {
        this.name = name;
        this.salary = salary;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
