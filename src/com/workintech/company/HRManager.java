package com.workintech.company;

import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName()+ "HR Manager starts to project.");
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = junior;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper mid) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = mid;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = senior;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " HRManager{" +
                "juniors=" + Arrays.toString(juniorDevelopers) +
                ", mids=" + Arrays.toString(midDevelopers) +
                ", seniors=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
