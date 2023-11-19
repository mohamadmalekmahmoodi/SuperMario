package org.example.modol.challenge;

public class Challenge3 implements Challenge{
    private static Challenge3 challenge3;
    private Challenge3(){

    }
    public static Challenge3 getInstance(){
        if (challenge3 == null){
            challenge3 = new Challenge3();
        }
        return challenge3;
    }
    @Override
    public void step() {
        System.out.println("c3 did Challenge 3 ");
    }
}
