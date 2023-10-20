package PeopleSchool;

import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Student student = new Student();

        String border = "<----------------------------------------------->";
        String information = "information";

        do {
            System.out.print("Press 'E' for Employee, 'F' for faculty, or 'S' for student: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "E":
                    System.out.println("Type Employee's name, contact number, salary & department: ");
                    employee.setName(sc.nextLine());
                    employee.setContactNum(sc.nextLine());
                    employee.setSalary(sc.nextDouble());
                    employee.setDepartment(sc.next());
                    System.out.println(border);
                    System.out.println("Employee " + information);
                    System.out.println(border);
                    System.out.println(employee.getName());
                    System.out.println(employee.getContactNum());
                    System.out.println(employee.getSalary());
                    System.out.println(employee.getDepartment());
                    break;

                case "F":
                    System.out.println("Is the faculty Regular? Type 'Y' if yes, otherwise type 'N' if not: ");
                    char status = sc.nextLine().toUpperCase().charAt(0);
                    boolean isRegular = status == 'Y';
                    faculty.setRegular(isRegular);

                    if (status == 'Y') {
                        System.out.println("Type Faculty member's name, contact number, salary :");
                        faculty.setName(sc.nextLine());
                        faculty.setContactNum(sc.nextLine());
                        faculty.setSalary(sc.nextDouble());
                        System.out.println(border);
                        System.out.println("Faculty " + information);
                        System.out.println(border);
                        System.out.println(faculty.getName());
                        System.out.println(faculty.getContactNum());
                        System.out.println(faculty.getSalary());
                        System.out.println("Status: " + (isRegular ? "Regular" : "Irregular"));
                    }
                    break;
                case "S":

                    System.out.println("Type Student's name, contact number:");
                    student.setName(sc.nextLine());
                    student.setContactNum(sc.nextLine());

                    System.out.print("Enrolled Program: ");
                    student.setProgram(sc.next());

                    System.out.print("Year Level: ");
                    int yrLvl = sc.nextInt();

                    if (yrLvl > 4 || yrLvl < 1) {
                        System.out.println("Invalid.");
                    } else {
                        student.setYearLevel(yrLvl);
                        System.out.println(border);
                        System.out.println("Student " + information);
                        System.out.println(border);
                        System.out.println(student.getName());
                        System.out.println(student.getContactNum());
                        System.out.println(student.getProgram().toUpperCase());

                        String condition = student.getYearLevel() == 1 ? "First Year"
                                : student.getYearLevel() == 2 ? "Second Year"
                                        : student.getYearLevel() == 3 ? "Third Year"
                                                : student.getYearLevel() == 4 ? "4th Year" : "";

                        System.out.println(condition);

                    }

            }
        } while (true);

    }
}