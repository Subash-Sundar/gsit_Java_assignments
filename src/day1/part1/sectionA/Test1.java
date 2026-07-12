package day1.part1.sectionA;

import accessTraining.Access;

class base{
    public static void main(String[] args) {
        Access acc = new Access();
        acc.publicNum = 20;
    }
}


public class Test1 extends Access {
    void print(){
        protectedNum = 20;
    }
}
