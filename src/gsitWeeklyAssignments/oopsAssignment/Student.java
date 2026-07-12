package gsitWeeklyAssignments.oopsAssignment;

public class Student extends Person{
    int marks;
    Student(String name,int age, int marks){
       super(name,age);
       this.marks = marks;
    }
    void display(){
        System.out.println(name + " " + age +" "+marks);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Subash",29,100);
        st1.display();
    }
}
