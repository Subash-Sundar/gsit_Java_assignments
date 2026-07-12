package javaBasics;

public class MethodsDemo {
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int b){
        return b;
    }
    static int sum(){
        return -1;
    }
    static float sum(float a, float b){
        return a+b;
    }
    public static void sumOfArray(int[] arr){
        int num = 0;
        for(int n: arr){
            num =num +n;
        }
        System.out.println("Sum : "+num);
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println("--------------------------------------");
        System.out.println(sum(102,202));
        System.out.println("--------------------------------------");
        System.out.println(sum(10.8f,20.17f));
        System.out.println("--------------------------------------");
        System.out.println(sum());
        System.out.println("--------------------------------------");
        int[] arr1 = {10,20,30,40,50,60,70};
        sumOfArray(arr1);
        System.out.println("--------------------------------------");
    }
}
