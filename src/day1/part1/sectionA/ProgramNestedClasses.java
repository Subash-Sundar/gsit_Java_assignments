package day1.part1.sectionA;

class Scenario
{
    String scenario;
    class TestCase
    {
        String testCase;
    }
    static class Project
    {
        String ProjectId;
    }
}



public class ProgramNestedClasses {
    public static void main(String[] args) {
        Scenario sc = new Scenario();
        Scenario.TestCase tc = sc.new TestCase();
        Scenario.Project project = new Scenario.Project();
    }
}
