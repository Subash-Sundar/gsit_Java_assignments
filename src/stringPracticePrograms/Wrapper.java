package stringPracticePrograms;

public class Wrapper
{
    public static void main(String[] args) {
        int num = 10; //primitive data type
        Integer num2 = num; //autoboxing it to a wrapper class
        int num3 = num2; //unboxing

        String numb = "10";
        int number = Integer.parseInt(numb);

        System.out.println(number);

    }
}
