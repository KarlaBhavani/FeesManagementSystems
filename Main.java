package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FeeManagement feesManagementSystem = new FeeManagement();

        // Adding sample students
        Student student1 = new Student("Alice", 101, 5000);
        Student student2 = new Student("Bob", 102, 6000);
        feesManagementSystem.addStudent(student1);
        feesManagementSystem.addStudent(student2);

        System.out.print("Enter roll number of the student: ");
        int rollNumber = scanner.nextInt();

        Student student = feesManagementSystem.getStudent(rollNumber);

        if (student != null) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Total Fees: " + student.getTotalFees());
            System.out.println("Fees Paid: " + student.getFeesPaid());
            System.out.println("Remaining Fees: " + student.getRemainingFees());

            System.out.print("Enter amount to pay: ");
            double amount = scanner.nextDouble();
            student.payFees(amount);

            System.out.println("Fees paid successfully.");
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }
}