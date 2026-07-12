package javaBasics;

public class Program_PassMethod {
    static void increment(int num){
        num++;
    }
    static void increment(int[] arr){
        arr[0]++;
    }

    public static void main(String[] args) {
        int data = 10;
        increment(data);
        System.out.println(data);
        int [] arr1 = {100};
        increment(arr1);
        System.out.println(arr1[0]);
    }
}
