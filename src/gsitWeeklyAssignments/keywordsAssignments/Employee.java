package gsitWeeklyAssignments.keywordsAssignments;

public class Employee
{
    int empID;
    String name;
    double salary;
    static String companyName = "ABC Technologies";

    Employee(int empID, String name, double salary)
    {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }
    static void displayCompany()
    {
      System.out.println("Company Name: "+companyName);
    }
    void employeeDetails()
    {
        System.out.println();
        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("Employee ID : "+empID);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);

    }

    public static void main(String[] args)
    {
        Employee emp1 = new Employee(101,"John",25000.00);
        Employee emp2 = new Employee(102,"Khan",29000.00);
        Employee emp3 = new Employee(103,"Thawn",50000.00);
        Employee.displayCompany();
        emp1.employeeDetails();
        emp2.employeeDetails();
        emp3.employeeDetails();
    }
}
