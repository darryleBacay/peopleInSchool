package PeopleSchool;

class Student extends Person {
    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        program = p;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int y) {
        yearLevel = y;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}
