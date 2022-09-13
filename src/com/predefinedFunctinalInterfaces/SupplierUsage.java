package com.predefinedFunctinalInterfaces;

import java.util.function.Supplier;

public class SupplierUsage {


    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", 22);
        System.out.println(emp1.getName());
        Payroll payroll = new Payroll("Basic", 20000);
        System.out.println(payroll.getName());

        Supplier<Employee> employeeSupplier = () -> new Employee("Alice",22);
        Supplier<Payroll> payrollSupplier = () -> new Payroll("Basic",20000);

    }

}

class Employee{
    private String name;
    private int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

class Payroll{
    private String name;
    private int amount;

    Payroll(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

}
