package day1.part1.sectionA;

public class Employee {
    String name;
    int age;
    float salary;
    void print(){
        System.out.println(name+":"+age+":"+salary);
    }
    Employee(String name1, int age1, float salary1){
        name = name1;
        age = age1;
        salary = salary1;
        System.out.println("Constructor called");
    }
}
