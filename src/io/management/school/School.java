package io.management.school;

import java.util.List;

/**
 * School contains:
 * Teachers
 * Students
 * Total money earned (Students Fees)
 * Total money spent (Teachers Salary)
 * Implements multiple Students and Teachers using ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * constructor: creates a new object of class School by initialising the values of an object
     * @param teachers
     * @param students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.totalMoneyEarned=0;
        this.totalMoneySpent=0;
        this.teachers = teachers;
        this.students = students;
    }


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned+= moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneyLeft(int MoneySpent) {
        totalMoneyEarned-= MoneySpent;
    }


    @Override
    public String toString() {
        return "School{" +
                "teachers=" + teachers +
                ", students=" + students +
                ", totalMoneyEarned=" + totalMoneyEarned +
                ", totalMoneySpent=" + totalMoneySpent +
                '}';
    }
}
