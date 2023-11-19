package org.example.modol.level;

import java.util.concurrent.ExecutionException;

public class Easy implements Level{
    private static Easy easy;
    private Easy(){

    }
    public static Easy getInstance(){
        if (easy == null){
            easy = new Easy();
        }
        return easy;
    }
    @Override
    public void perform() {
        System.out.println("game played with easy mood");
    }

}
