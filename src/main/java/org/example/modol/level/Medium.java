package org.example.modol.level;

public class Medium implements Level{
    private static Medium medium;
    private Medium(){

    }
    public static Medium getInstance(){
        if (medium == null){
            medium = new Medium();
        }
        return medium;
    }
    @Override
    public void perform() {
        System.out.println("game played with medium mood");
    }
}
