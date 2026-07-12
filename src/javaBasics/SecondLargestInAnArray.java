package javaBasics;

public class SecondLargestInAnArray {
    public static void secondLargestWithTwoLoops(){
        int[] arr = {1,2,1,3,-1,4,-9,9,9};
        int largest = 0;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i <arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i <arr.length; i++){
            if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest number is "+secondLargest);
    }

    public static void secondLargestWithSingleLoop(){
        int[] arr = {20,20,19,18,30,49,24};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest : "+largest);
        System.out.println("Second Largest : "+secondLargest);
        }
    public static void main(String[] args) {
        secondLargestWithSingleLoop();
    }
    }


