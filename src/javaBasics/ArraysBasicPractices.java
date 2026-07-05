package javaBasics;

public class ArraysBasicPractices {

    public static void arraySample(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0; i < numbers.length; i ++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.println("The reverse :");
        for(int i = (numbers.length-1); i >= 0; i --){
            System.out.print(numbers[i]+" ");
        }
        numbers[0] = -1;



    }

    public static void main(String[] args) {
        arraySample();
    }

}
