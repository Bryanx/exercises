package employee;

public class Employee {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String eMail;

    public Employee(String givenName, String surName, int age, Gender gender, Role role, String dept, String eMail) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.role = role;
        this.dept = dept;
        this.eMail = eMail;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return eMail;
    }

    public String getFullName() {
        return getSurName() + " " + getGivenName();
    }

    @Override
    public String toString() {
        return String.format("%-15s age: %2d gender: %-8s e-mail: %-30s role: %-12s dept: %-10s",
                getFullName(), age, gender, eMail, role, dept);
    }
}
