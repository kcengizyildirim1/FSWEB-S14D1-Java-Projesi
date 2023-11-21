package com.workintech.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }



    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName()+"Senior Developer starts to working");
    }


}
