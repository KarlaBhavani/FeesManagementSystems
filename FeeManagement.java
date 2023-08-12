package org.example;

import java.util.*;

public class FeeManagement {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getRollNumber(), student);
    }

    public Student getStudent(int rollNumber) {
        return students.get(rollNumber);
    }
}
