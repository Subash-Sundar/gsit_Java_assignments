package day1.part1.sectionA;

class Users
{
    String name;
    int age;
    Users()
    {
        System.out.println("Default constructed called");
    }
    Users(String name, int age)
    {
        this();
        this.name = name;
        this.age = age;

    }
    Users(String name)
    {
        this(name,-1);
    }
}

public class ProgramConstructorChaining
{
    public static void main(String[] args) {
        Users user = new Users("Subash",29);
        System.out.println("Name: "+ user.name+" Age: "+user.age);

        Users user1 = new Users("Stark");
        System.out.println("Name: "+ user1.name+" Age: "+user1.age);
    }
}
