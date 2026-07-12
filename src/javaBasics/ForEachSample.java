package javaBasics;

public class ForEachSample {
    public static void forEachSampleOne(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        forEachSampleOne();
    }
}
