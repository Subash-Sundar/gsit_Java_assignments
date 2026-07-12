package javaBasics;


public class PatternsWithLoops {
    public static void triangleInStars(int n){
        for(int i = 1; i<= n; i++ ){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleInNumbs(int n){
        int counter = 1;
        for(int i = 1; i<= n; i++ ){
            for(int j = 1; j<= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void invertedTriangleInStars(int n){
        for(int i = 1; i<= n; i++ ){
            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangleInStars(5);
        System.out.println("--------------------------------------");
        triangleInNumbs(5);
        System.out.println("--------------------------------------");
        invertedTriangleInStars(5);

    }

}
