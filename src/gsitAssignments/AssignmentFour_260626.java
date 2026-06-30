package gsitAssignments;

public class AssignmentFour_260626 {
    public static void factorialOf(int num){
        int product = 1;
        for (int i = 1; i <= num ; i++){
            product = product*i;
        }
        System.out.println("Factorial Of "+num +" is " + product);
    }

    public static void digitCountOf(int num){
        int org = num;
        int count = 0;
        for (int i =0 ; num > 0; i++){
            num = num/10;
            count = count + 1;
        }
        System.out.println("The number of digits in "+org+" is "+count);
    }

    public static void sumOfDigits(int num){
        int org = num;
        int sum = 0;
        for (int i =0 ; num > 0; i++){
            sum = sum + num%10;
            num = num/10;

        }
        System.out.println("The sum of digits of "+org+" is "+sum);
    }

    public static void factorsOf(int num){
        if(num != 0){
            System.out.println("Factors of "+ num +" are:" );
        }
        for(int i = 1; i < num; i++){

            if(num%i == 0){
                System.out.println(i);
            }
        }
    }

    public static void fibonacciSeries(int num){
        if (num <= 1){
            System.out.println("The Fibonacci Series is 0,1");
        }
        if (num > 1){
            int superPreviousValue = 0;
            int previousValue = 1;
            System.out.print("The Fibonacci Series is 0,1");
            for (int k = 2; k <= num ; k++){
                int currentValue = superPreviousValue + previousValue;
                System.out.print(","+currentValue);
                superPreviousValue = previousValue;
                previousValue = currentValue;

            }
        }
    }
    public static void main(String[] args) {
        factorialOf(0);
        digitCountOf(234567);
        sumOfDigits(234567);
        factorsOf(28);
        fibonacciSeries(8);
    }
}
