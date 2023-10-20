package PeopleSchool;

class Faculty extends Employee {
    private boolean status;

    public void setRegular(boolean r) {
        status = r;
    }

    public boolean isRegular() {
        return status;
    }
}
