package day1.part1.sectionA;
interface ITestA
{
    int num1 =10;
    int num2 = 20; //all are public static final attributes by default.
    void hello();
    default void bye()
    {
        System.out.println("bye");
    }
    static void grade()
    {
        System.out.println("Grade A+");
    }
}
interface ITestB
{
    void hello();
    int num1 = 100;
}
class TestX implements ITestA,ITestB
{
    public void hello()
    {
        System.out.println("Hello");
    }
}

public class ProgramInterfacesUnderstanding
{
    public static void main(String[] args) {
        TestX obj = new TestX();
        obj.hello();
        System.out.println(ITestB.num1);
        System.out.println(ITestA.num1);

    }
}
