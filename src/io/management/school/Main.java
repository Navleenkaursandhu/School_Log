package io.management.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student raj = new Student(1, "Raj", 4);
        Student deep = new Student(2, "Deep", 7);
        Student nav = new Student(3, "Nav", 12);

        List<Student> students = new ArrayList<>();
        students.add(raj);
        students.add(deep);
        students.add(nav);

        Teacher joshi = new Teacher(1, "Joshi", 2000);
        Teacher sandeep =  new Teacher (2, "Sandeep", 3000);
        Teacher param = new Teacher(3, "Param", 1500);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(joshi);
        teachers.add(sandeep);
        teachers.add(param);

        School xavier = new School(teachers, students);
        System.out.println(xavier);


        raj.setFeePaid(5000);
        deep.setFeePaid(6000);
        nav.setFeePaid(4000);
        System.out.println("***************Money earned by school**************");
        System.out.println("School has earned: " + xavier.getTotalMoneyEarned());

        System.out.println("**************Money Spent By School**************");
        joshi.salaryEarned(joshi.getSalary());
        sandeep.salaryEarned(sandeep.getSalary());
        param.salaryEarned(param.getSalary());

        System.out.println("Money spent by school: " + xavier.getTotalMoneyEarned());

    }
}
