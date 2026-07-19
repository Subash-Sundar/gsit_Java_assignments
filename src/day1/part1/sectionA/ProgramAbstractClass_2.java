package day1.part1.sectionA;

abstract class Ratings
{
    int rate;
    abstract void setRate();
}

class DroneRate extends Ratings
{
    void setRate()
    {
        this.rate = 3;
    }
}
public class ProgramAbstractClass_2
{
    public static void main(String[] args) {
        Ratings rate = new DroneRate();
        rate.setRate();
        System.out.print(rate.rate);
    }
}
