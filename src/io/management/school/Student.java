package io.management.school;

/**
Student class contains:
ID
Name
Grade
Fees paid
Total Fees
 */


public class Student {

    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int totalFee;

    /**
     * To create new Student Object by initializing the values
     * Total fee for every student is 30000
     * Fee paid initially 0
     * @param id ID is unique for every student
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.feePaid=0;
        this.totalFee=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    /**
     * Method to upgrade student's grade
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep on adding the fee until it meets the criteria of total fee i.e.30000
     * @param feePaid
     */
    public void setFeePaid(int feePaid) {
        this.feePaid = this.feePaid + feePaid;
        School.updateTotalMoneyEarned(feePaid);

    }

    /**
     * getters
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public int getTotalFee() {
        return totalFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", feePaid=" + feePaid +
                ", totalFee=" + totalFee +
                '}';
    }
}
