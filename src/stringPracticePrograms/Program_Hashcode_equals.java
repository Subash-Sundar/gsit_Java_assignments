package stringPracticePrograms;
class Student
{
    int id ;
    String name;
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
public class Program_Hashcode_equals
{
    public static void main(String[] args)
    {
        String str1 = "Aa";
        String str2 = "BB";
        String str3 = new String("Aa");
        System.out.println("str1 : "+str1.hashCode());
        System.out.println("str2 : "+str2.hashCode());
        System.out.println("str3 : "+str3.hashCode());

        Character c1 = 'A';
        Character c2 = 'B';
        Float f1 = 10.2F;
        Double d1 = 10.2;
        Student s1 = new Student(1,"A");
        Student s2 = new Student(1,"A");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(f1.hashCode());
        System.out.println(d1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        if(s1.equals(s2)){
            System.out.println("One");
        }
        else
            System.out.println("Two");
    }
}
