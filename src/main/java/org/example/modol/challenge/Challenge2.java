package org.example.modol.challenge;

public class Challenge2 implements Challenge{
    private static Challenge2 challenge2;
    private Challenge2(){

    }
    public static Challenge2 getInstance(){
        if (challenge2 == null){
            challenge2 = new Challenge2();
        }
        return challenge2;
    }
    @Override
    public void step() {
        System.out.println("c2 did Challenge 2 ");
    }
}
