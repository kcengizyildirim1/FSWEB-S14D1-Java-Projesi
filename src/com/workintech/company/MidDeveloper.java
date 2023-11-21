package com.workintech.company;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name) {
        super(id, name);
    }


    @Override
    public void work() {
        setSalary(35000);
        System.out.println(getName()+"Mid Developer starts to working");
    }
}
