package com.workintech.company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(30000);
        System.out.println(getName()+ "Junior Developer starts to working");
    }
}
