package javaBasics;

import java.util.*;

public class PilotProgram {

    public static void scannerDemo(){
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The square of "+num+" is "+num*num);
    }

    public static void menu(){
        System.out.println("1. Press 1 to print square of input\n" +
                "\n" +
                "2. Press 2 to check if input is even or odd\n" +
                "\n" +
                "3. Press 3 to print \n" +
                "\n" +
                "   ****\n" +
                "\n" +
                "   *  *\n" +
                "\n" +
                "   *  *\n" +
                "\n" +
                "   ****\n" +
                "\n" +
                "4. Press any other Key to exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int inputNumber = sc.nextInt();
        menu();
        System.out.println("Please select the menu option to proceed");
        int menuOption = sc.nextInt();
        if(menuOption == 1){
            System.out.println("The square of "+inputNumber+" is "+inputNumber*inputNumber);
            menu();
        }
        if(menuOption == 2){
            if(inputNumber%2 == 0){
                System.out.println("The given input is even");
            }
            else{
                System.out.println("The given input is odd");
            }
            menu();
        }
        if (menuOption == 3){

        }
    }
}
