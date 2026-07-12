package day1.part1.sectionA;

class TestingThis
{
    int num1;
    int num2;
    void hello()
    {
        System.out.println("Hello");
    }
    void bye()
    {
        this.hello();
        System.out.println("Hello");
    }
    TestingThis(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class ProgramThis
{
    public static void main(String[] args) {

    }
}
