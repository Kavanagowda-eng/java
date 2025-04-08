package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Employee;
import com.xworkz.Inheritence.internal.Manager;

public class EmployeeRunner {
    public static void main(String[]args) {
        Employee employee = new Employee();
        employee.department();
        employee.eat();
        employee.salary();
        employee.work();
        employee.timepass();
        System.out.println("--------------------------------");

        Employee employee1 = new Manager();
        employee1.department();
        employee1.eat();
        employee1.salary();
        employee1.work();
        employee1.timepass();
        System.out.println("--------------------------------");

        Employee employee2= new Manager();
        employee2.department();
        employee2.eat();
        employee2.salary();
        employee2.work();
        employee2.timepass();
        System.out.println("--------------------------------");

        Employee employee3 = new Manager();
        employee3.department();
        employee3.eat();
        employee3.salary();
        employee3.work();
        employee3.timepass();
        System.out.println("--------------------------------");
    }



}
