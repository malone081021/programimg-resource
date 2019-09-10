package com.malone.hello.methodreference;

public class StudentComparator {
    public  int compareByScore(Student student1,Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public   int compareByName(Student student1,Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
