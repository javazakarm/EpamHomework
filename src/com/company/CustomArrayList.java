package com.company;

import java.util.Arrays;

public class CustomArrayList {
    private Students[] student;
    private int size;

    public CustomArrayList(int size) {
        student = new Students[10];
        this.size = size;
    }

    public Students get(int index) {
        if (index < size) {
            return student[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return size;
    }

    public boolean add(Students students) {
        if (student.length - size == 1) {
            increaseListSize();
        }
        student[size++] = students;
        return true;
    }

    private void increaseListSize() {
        student = Arrays.copyOf(student, student.length * 2);
        System.out.println("\nNew length: " + student.length);
    }

    //
    public boolean remove(Students students) {
        for (int i = 0; i < size; i++) {
            if (students.equals(student[i])) {
                System.arraycopy(student, i + 1, student, i, size - 1 - i);
            }
        }
        return true;
    }

    public void printElements() {
        for (int i = 0; i < size; i++) {
            System.out.println(student[i]);
        }
    }
}
