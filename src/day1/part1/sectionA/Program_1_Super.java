package day1.part1.sectionA;


class Parent
{
    String house;
    Parent(String house)
    {
        this.house = house;
        System.out.println("Parent constructor is called");
    }
}

class Child extends Parent
{
    String car;
    void print(){
        System.out.println(this.car+":"+this.house);
    }
    void show()
    {
        System.out.println(super.house);
    }
    Child(String house, String car)
    {
        super(house);
        this.car = car;
        System.out.println("Child constructor is called");
    }
}

public class Program_1_Super
{
    public static void main(String[] args) {
        Child child = new Child("2BHK","Mercedes");
        child.print();

    }
}
