package javaBasics;

public class SwapTechniques {
    public static void swapWithTempVar(int a, int b){
        int temp;
        System.out.println("Before Swap a,b = " +a+","+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap a,b = " +a+","+b);
    }
    public static void swapWithoutTempVar(int a, int b){
        System.out.println("Before Swap a,b = " +a+","+b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap a,b = " +a+","+b);
    }

    public static void swapWithXOR(int a, int b){
        System.out.println("Before Swap a,b = " +a+","+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swap a,b = " +a+","+b);
    }

    public static void main(String[] args) {
        swapWithTempVar(10,7);
        System.out.println("--------------------------------------------------------");
        swapWithoutTempVar(11,7);
        System.out.println("--------------------------------------------------------");
        swapWithXOR(51,47);
    }
}
