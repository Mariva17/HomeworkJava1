package HomeworkExample10022023;

public class Department {

    private String nameDep;
    private int employees;
    private String nameComp;


    public Department(String nameDep, int employees, String nameComp) {
        this.nameDep = nameDep;
        this.employees = employees;
        this.nameComp = nameComp;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getNameComp() {
        return nameComp;
    }

    public void setNameComp(String nameComp) {
        this.nameComp = nameComp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDep='" + nameDep + '\'' +
                ", employees=" + employees +
                ", nameComp='" + nameComp + '\'' +
                '}';
    }
}

