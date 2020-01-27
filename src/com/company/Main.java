package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<Students>();
        Students s1 = new Students("Aram", "Manukyan", 20);
        Students s2 = new Students("Mane", "Vardanyan", 19);
        Students s3 = new Students("Hakob", "Jnaryan", 33);
        LinkedList<Students> students1 = new LinkedList<>(students);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        CustomArrayList customArrayList = new CustomArrayList(students.size());
//        Task 3 add() function new student in ArrayList
        for (Iterator<Students> i = students.iterator(); i.hasNext(); ) {
            customArrayList.add(i.next());
        }
//       Task 3 int size() function
        System.out.println(customArrayList.size());
//       Task 3 remove() function First element remove
        customArrayList.remove(students.get(0));
        customArrayList.printElements();
//      Task 3 get() function
        customArrayList.get(2);
        Collections.sort(students, new StudentsAgeComparator());//collections.reverseorder()
        System.out.println("Task 1\nSorted by reverse order of age\n");
        for (Students st : students) {
            System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getAge());
        }
        Collections.sort(students, new StudentsNameComparator());
        System.out.println("\nSorted by firstname\n");
        for (Students st : students) {
            System.out.println(st);
        }
        System.out.println("Task 2\nSorted by lastname\n");
        Collections.sort(students1);
        for (Students value : students1) {
            System.out.println(value);
        }

        DoublyLinkedList studentsDynamicLinkedList = new DoublyLinkedList();
        studentsDynamicLinkedList.push(s1);
        studentsDynamicLinkedList.push(s2);
        studentsDynamicLinkedList.addLast(s3);
        studentsDynamicLinkedList.print();
        System.out.println(studentsDynamicLinkedList.size());
        studentsDynamicLinkedList.pop();
    }
}

