package day1.part1.sectionA;

abstract class Animals
{
    abstract void sound();
}

class Dogs extends Animals
{
    void sound()
    {
        System.out.println("Woof");
    }
}

public class ProgramAbstractClasses
{
    public static void main(String[] args)
    {
        Animals Lab = new Dogs();
        Dogs Dober = new Dogs();
        Dober.sound();
        Lab.sound();
    }


}
