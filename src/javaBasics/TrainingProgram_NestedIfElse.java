package javaBasics;

public class TrainingProgram_NestedIfElse {
    public static void main(String[] args) {
        int age = 18;
        char gender = 'M';
        if (age == 18){
            System.out.println("Congrats on your first Vote :)");
            if (gender == 'F'){
                System.out.println("Please cast your vote young lady");
            }
            else {
                System.out.println("Please cast your vote young man");
            }

        }
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }


}
