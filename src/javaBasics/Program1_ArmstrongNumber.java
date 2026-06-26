package javaBasics;

import java.util.Scanner;

public class Program1_ArmstrongNumber {

    public static void armstrongIdentifier(String input){

        int num = Integer.parseInt(input);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number that needs to be verified if its Armstrong number or not :");
        String input = sc.nextLine();
        sc.close();
    }



}
