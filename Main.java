package HomeworkExample10022023;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("BMW");
        System.out.println(company);

        Department department = new Department("IT", 22, "Audi");
        System.out.println(department);

        Employee employee = new Employee("Helen", "Kotova", 3200, "HR", "manager");
        System.out.println(employee);

        TypeOfEmployee typeOfEmployee = new TypeOfEmployee("Ivan", "Ivanov", 2500, "Sales", "Sales Manager");
        typeOfEmployee.setStaffOrContract("contract");
        System.out.println(typeOfEmployee);
        System.out.println(typeOfEmployee.getStaffOrContract());


    }

}
