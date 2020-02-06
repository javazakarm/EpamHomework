package com.company;

import java.util.Objects;

public class Students implements Comparable<Students> {
    private String firstName;
    private String lastName;
    private int age;

    public Students(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }

    @Override
    public int compareTo(Students st) {
        int last = this.lastName.compareTo(st.lastName);
        return last == 0 ? this.firstName.compareTo(st.firstName) : last;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}


