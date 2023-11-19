package org.example.modol.challenge;

public class Challenge1 implements Challenge{
    private static Challenge1 challenge1;
    private Challenge1(){

    }
    public static Challenge1 getInstance(){
        if (challenge1 == null){
            challenge1 = new Challenge1();
        }
        return challenge1;
    }
    @Override
    public void step() {
        System.out.println("c1 did Challenge 1 ");
    }
}
