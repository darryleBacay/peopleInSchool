package PeopleSchool;

import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        // Object calls
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Student student = new Student();

        String border = "<--------------------------------->";

        // Choice var
        String choice;

        // Storage
        /* Employee */
        double salary;
        String department, name, contactNum;

        /* Faculty */
        String status, fName, fContact;
        boolean regular;

        do {
            System.out.print("Press E for Employee, F for faculty, or S for Student: ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("E")) {

                System.out.print("Enter your Name: ");
                name = sc.nextLine();
                employee.setName(name);

                System.out.print("Enter your Contact number: ");
                contactNum = sc.nextLine();
                employee.setContactNum(contactNum);

                System.out.print("Enter your Monthly salary: ");
                salary = sc.nextDouble();
                employee.setSalary(salary);

                System.out.print("Enter your department: ");
                department = sc.next();
                employee.setDepartment(department);

                System.out.println();

                System.out.println(border);

                System.out.println("Name: " + employee.getName());
                System.out.println("Contact: " + employee.getContactNum());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Department: " + employee.getDepartment().toUpperCase());

            } else if (choice.equalsIgnoreCase("F")) {
                System.out.print("Are you regular? Type 'y' if yes, otherwise type 'n' if not :");
                status = sc.nextLine();
                if (status.equalsIgnoreCase("y")) {
                    regular = status == "Y" || status == "y";

                    System.out.print("Enter your Name: ");
                    fName = sc.nextLine();
                    faculty.setName(fName);

                    System.out.print("Enter your Contact Number: ");
                    fContact = sc.nextLine();
                    faculty.setContactNum(fContact);

                    System.out.print("Enter your Salary: ");
                    double fSalary = sc.nextDouble();
                    faculty.setSalary(fSalary);

                    System.out.print("Enter your Department: ");
                    String fDepartment = sc.next();
                    faculty.setDepartment(fDepartment);

                    System.out.println(border);

                    System.out.println("Faculty Information");
                    System.out.println("Name: " + faculty.getName());
                    System.out.println("Contact Number: " + faculty.getContactNum());
                    System.out.println("Salary: " + faculty.getSalary());
                    System.out.println("Department: " + faculty.getDepartment().toUpperCase());

                } else if (status.equalsIgnoreCase("N")) {
                    System.out.println("Okay thank you.");
                } else {
                    System.out.println("Y and N only.");
                }
            } else if (choice.equalsIgnoreCase("S")) {

                System.out.print("Enter your Name: ");
                String sName = sc.nextLine();
                student.setName(sName);

                System.out.print("Enter your Contact Number: ");
                String sContact = sc.nextLine();
                student.setContactNum(sContact);

                System.out.print("Enrolled Program: ");
                String program = sc.next();
                student.setProgram(program);

                System.out.print("Year Level: ");
                int yrLevel = sc.nextInt();
                if (yrLevel > 4) {
                    System.out.println("Invalid!");
                } else {
                    student.setYearLevel(yrLevel);
                    System.out.println(border);

                    System.out.println("Student Information");
                    System.out.println("Name: " + student.getName());
                    System.out.println("Contact Number: " + student.getContactNum());
                    System.out.println("Program: " + student.getProgram());
                    System.out.println("Year Level: " + student.getYearLevel());
                }

            }
        } while (true);
    }

}
