package org.example.modol.level;

public class Hard implements Level{
    private static Hard hard;
    private Hard(){

    }
    public static Hard getInstance(){
        if (hard == null){
            hard = new Hard();
        }
        return hard;
    }
    @Override
    public void perform() {
        System.out.println("game played with hard mood");
    }
}
