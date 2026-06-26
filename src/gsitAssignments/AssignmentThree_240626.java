package gsitAssignments;

public class AssignmentThree_240626 {

    public static void gradeOf(int mark){
        if(mark >= 0 && mark <= 39){
            System.out.println("The grade is : Fail");
        }
        else if(mark <= 59){
            System.out.println("The grade is : D");

        }
        else if(mark <= 74){
            System.out.println("The grade is : C");

        }
        else if(mark <= 89){
            System.out.println("The grade is : B");

        }
        else if(mark <= 100){
            System.out.println("The grade is : A");

        }
        else if(mark < 0 || mark > 100){
           System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
    gradeOf(60);
    }
}
