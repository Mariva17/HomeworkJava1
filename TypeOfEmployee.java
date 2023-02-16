package HomeworkExample10022023;

public class TypeOfEmployee extends Employee {

    public String staffOrContract;



    public TypeOfEmployee(String name, String surname, double salary, String nameDep, String position) {
        super(name, surname, salary, nameDep, position);
    }

    public String getStaffOrContract() {
        return staffOrContract;
    }

    public void setStaffOrContract(String staffOrContract) {
        this.staffOrContract = staffOrContract;
    }


}
