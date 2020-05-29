package ch7;

public class Person {

    Department department;

    public Department getDepartment() {
        return department;
    }

    public Person getManager() {
        return department.getManager();
    }

}
