package day1.part1.sectionA;

class Animal
{
    void sound()
    {
        System.out.println("Sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Bark");
    }

}


public class Program_Mystique extends Dog
{
    final int age = 20;
     void sound()
    {
        System.out.println("Toing");
    }
    public static void main(String[] args) {
        Animal pug = new Dog();
        pug.sound();
        Program_Mystique mys = new Program_Mystique();
        mys.sound();

    }

}
