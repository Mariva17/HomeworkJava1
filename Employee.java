package HomeworkExample10022023;

public class Employee {

    private String name;
    private String surname;
    private double salary;
    private String nameDep;
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(String name, String surname, double salary, String nameDep, String position) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.nameDep = nameDep;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", nameDep='" + nameDep + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
