package javaBasics;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int num = 1221;
        int org = num;
        int reverse = 0;
        for (;num > 0;){
            int lastDigit = num%10;
            reverse = reverse * 10 + lastDigit;
            num = num/10;
        }
        System.out.println(reverse + " is the reverse of given number " +org);
        if(org == reverse){
            System.out.println("The given number is a palindrome");

        }
        else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
