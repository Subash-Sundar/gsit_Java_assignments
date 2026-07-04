package javaBasics;

public class WhileLoopTraining {

    public static void sampleLoop(){
        int num = 1;
        while(num <=10){
            System.out.println(num);
        }
    }

    public static void evenReversal(){
        int num = 100;
        while(num >= 88){
            System.out.print(num + " ");
            num--;
            num--;
        }
    }

    public static void sampleDoWhile(){
        int num = 11;
        do{
           System.out.println("Print some text");
           num++;
        }while(num <= 12);
    }
    public static void main(String[] args) {
        //evenReversal();
        //sampleLoop();
        sampleDoWhile();
    }
}
