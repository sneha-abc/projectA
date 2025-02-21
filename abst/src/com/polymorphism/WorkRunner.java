package com.polymorphism;

public class WorkRunner {
    public static void main(String[] args){

        EmployeeClass employeeClass = new EmployeeClass();
        employeeClass.work();

        Developer developer = new Developer();
        developer.work();

        Tester tester = new Tester();
        tester.work();
    }
}
