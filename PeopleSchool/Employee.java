package PeopleSchool;

class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double s) {
        salary = s;
    }

    public Double getSalary() {
        return salary;
    }

    public void setDepartment(String d) {
        department = d;
    }

    public String getDepartment() {
        return department;
    }
}
