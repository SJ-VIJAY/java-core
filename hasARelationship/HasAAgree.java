package hasARelationship;

class Employee{
    EmployeeDetails emp;

    void display(EmployeeDetails emp){
        this.emp = emp;

        System.out.println("Employee Name: "+emp.name);
        System.out.println("Employee Id: "+emp.empId);
        System.out.println("Company Name: "+emp.company);
        System.out.println("Employee Salary: "+emp.salary);

    }
}
class EmployeeDetails{
    String name;
    int empId;
    String company;
    double salary;

    public EmployeeDetails(String name, int empId, String company, double salary) {
        this.name = name;
        this.empId = empId;
        this.company = company;
        this.salary = salary;
    }
}
public class HasAAgree {
    public static void main(String[] args) {
        EmployeeDetails obj = new EmployeeDetails("Vijay",1234,"Wipro",20000);
        Employee obj1 = new Employee();
        obj1.display(obj);

    }
}
