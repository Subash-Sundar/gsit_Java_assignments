package gsitWeeklyAssignments.keywordsAssignments;

public class Car extends Vehicle
{
    String model;
    Car(String brand, int year, String model)
    {
        super(brand,year);
        this.model = model;
    }
    void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println();
        System.out.println("Car Information");
        System.out.println("---------------");
        System.out.println("Model : "+model);

    }
    public static void main(String[] args) {
        Car benz = new Car("Mercedes",1996,"320d");
        benz.displayVehicleInfo();

    }
}
