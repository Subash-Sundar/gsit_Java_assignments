package javaBasics;

public class DebuggerDemo {
    public static void forEachSampleOne(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int num : arr){
            sum = sum+num;
            //System.out.print(num + " ");
        }
        System.out.print("SUM : "+sum);
    }
    public static void main(String[] args) {
        forEachSampleOne();
    }
}
