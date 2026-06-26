package gsitAssignments;

public class AssignmentTwo_230626 {
    public static void asciiCode(){
        char upperAlpha = 'A';
        char lowerAlpha = 'a';
        char atTheRate = '@';
        char num = '0';
        int ValueOfA = upperAlpha;
        System.out.println("ASCII Value of A :"+ ValueOfA);
        int ValueOfa = lowerAlpha;
        System.out.println("ASCII Value of a :"+ ValueOfa);
        int ValueOf0 = num;
        System.out.println("ASCII Value of 0 :"+ ValueOf0);
        int ValueOfAt = atTheRate;
        System.out.println("ASCII Value of @ :"+ ValueOfAt);

    }
    public static void starPattern(){
        System.out.println('*');
        System.out.print('*');
        System.out.println('*');
        System.out.print('*');
        System.out.print('*');
        System.out.println('*');
        System.out.print('*');
        System.out.print('*');
        System.out.print('*');
        System.out.println('*');
        System.out.print('*');
        System.out.print('*');
        System.out.print('*');
        System.out.print('*');
        System.out.println('*');
    }
    public static void typeCaster(){
        double number = 10.75;
        int tcNumber = (int)number;
        System.out.println("The double number is : "+number);
        System.out.println("The type casted number is : "+tcNumber);
    }
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        asciiCode();
        System.out.println("--------------------------------------------------");
        starPattern();
        System.out.println("--------------------------------------------------");
        typeCaster();
        System.out.println("--------------------------------------------------");
    }
}
