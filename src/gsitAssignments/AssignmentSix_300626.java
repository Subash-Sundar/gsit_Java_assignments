package gsitAssignments;

public class AssignmentSix_300626 {

    public static void alternateAlpha(){
        int value = 65;
        while(value >= 65 && value <=90){
            char letter = (char) value;
            value = value +2;
            System.out.print(letter+" ");
        }
    }

    public static void asciiValues(){
        String allUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i = 0;
        while(i < 26){
            char letter = allUpper.charAt(i);
            int asciiValue = letter;
            System.out.println(letter+ " = " +asciiValue);
            i++;
        }
    }

    public static void main(String[] args) {
        alternateAlpha();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        asciiValues();
    }
}
