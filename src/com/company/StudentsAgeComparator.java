package com.company;

import java.util.Comparator;

public class StudentsAgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        return s2.getAge() - s1.getAge();
    }
}

