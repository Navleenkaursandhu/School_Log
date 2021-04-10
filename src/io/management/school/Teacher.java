package io.management.school;

/**
 * Teacher contains:
 * ID
 * Name
 * Salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * constructor: creates a new Teacher Object by initializing the values of Teacher Object
     * @param id
     * @param name
     * @param salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
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



    public int getSalary() {
        return salary;
    }

    /**
     * set the salary of a teacher
     * @param salary
     */

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public void salaryEarned(int salaryEarned){
        this.salaryEarned+=salaryEarned;
        School.updateTotalMoneyLeft(salary);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
