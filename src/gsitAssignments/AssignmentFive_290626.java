package gsitAssignments;

public class AssignmentFive_290626 {
    public static void bigDigitIn(int num){
        int org = num;
        int bigDigit = 0;
        for(;num > 0;){
            int lastDigit = num%10;
            num = num/10;
            if(lastDigit > bigDigit){
                bigDigit = lastDigit;
            }
        }
        System.out.println("The big digit in the given Number "+org+" is : "+bigDigit);
    }
    public static void main(String[] args) {
        bigDigitIn(123456789);
    }


}
