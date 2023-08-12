package org.example;

public class Student {
    private String name;
    private int rollNumber;
    private double feesPaid;
    private double totalFees;

    public Student(String name, int rollNumber, double totalFees) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getTotalFees() {
        return totalFees;
    }
    public void payFees(double amount) {
        feesPaid =feesPaid + amount;
    }

    public double getRemainingFees() {
       return totalFees - feesPaid;
    }
}
