package gsitWeeklyAssignments.oopsAssignment;

public class Employee
{
    int id;
    String name;
    double basicSalary;
    Employee(String name, int id, double basicSalary)
    {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    double calculateSalary()
    {
        double hra = 0.02 * basicSalary;
        double bonus = 0.01 * basicSalary;
        double totalSalary = basicSalary+hra+bonus;
        return totalSalary;

    }
    void display()
    {
        System.out.println("EMP ID: "+id);
        System.out.println("Name : "+name);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Total Salary: "+ calculateSalary());

    }

    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Subash",18800,15430.80);
        emp1.display();
    }
}
