package gsitWeeklyAssignments.keywordsAssignments;

public class Vehicle
{
    String brand;
    int year;
    Vehicle(String brand, int year)
    {
        this.brand = brand;
        this.year = year;
    }
    void displayVehicleInfo()
    {
        System.out.println();
        System.out.println("Vehicle Information");
        System.out.println("--------------------");
        System.out.println("Brand : "+brand);
        System.out.println("year : "+year);
    }
}
