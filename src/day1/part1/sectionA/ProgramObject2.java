package day1.part1.sectionA;

public class ProgramObject2 {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(1,"TestOne");
        Test t3 = new Test();
        t1.print();
        t2.print();
        t3.print();
        t2.setTestName("ISTQB");
        t2.print();
        int num = t2.getTestCode();
        System.out.println(num);
    }
}
